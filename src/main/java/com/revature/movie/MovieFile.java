package com.revature.movie;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.mapper.Mapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Created for csv file do seperate the different catergories into rows and columns.
 */

public class MovieFile extends HttpServlet {
    public MovieFile() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream filename = getClass().getClassLoader().getResourceAsStream("imdb_movie_data.csv");
        Scanner sc = new Scanner(filename, "UTF-8");
        sc.useDelimiter("\n");
        String urlFind = req.getParameter("find");
        //Allow to the write Http Server in Html

        resp.getWriter().println("<html>" +
                "                 <head>" +
                "                   <title>Movies Top 1000 2006 - 2016</title>" +
                "                 </head>" +
                "                 <body>" +
                "                   <table border = 2>" +
                "                       <tr>" +
                "                           <td>Rank</td>" +
                "                           <td>Title</td>" +
                "                           <td>Genre</td>" +
                "                           <td>Description</td>" +
                "                           <td>Director</td>" +
                "                           <td>Actors</td>" +
                "                           <td>Year</td>" +
                "                           <td>Runtime<br>(<i>In Minutes</i>)</td>" +
                "                           <td>Rating</td>" +
                "                           <td>Votes</td>" +
                "                           <td>Revenue<br>(<i>In Millions</i>)</td>" +
                "                           <td>Metascore</td>" +
                "                       </tr>" +
                "                       <tr>");
        String nline;
        //created array
        String[] movieList = new String[12];
        //looping through csv file
        while (sc.hasNext()) {
            nline = sc.next();

            if (urlFind == null || urlFind.equals(" ")) {
                //split movie data accurate movie data in the array
                movieList = nline.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                //Looping through the array
                for (int i = 0; i < 12; i++) {
                    //prints out the data for each row
                    resp.getWriter().println("<td>" + movieList[i] + "</td>");
                }
                //printing ending and beginning of the new row
                resp.getWriter().println("</tr><tr>");
            } else {
                if (nline.contains(urlFind)) {

                    //split movie data accurate movie data in the array
                    movieList = nline.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    //Looping through the array
                    for (int i = 0; i < 12; i++) {
                        //prints out the data for each row
                        resp.getWriter().println("<td>" + movieList[i] + "</td>");
                    }
                    //printing ending and beginning of the new row
                    resp.getWriter().println("</tr><tr>");
                }

            }
            }
        //Ending table, rows and html
        resp.getWriter().println("      </tr>" +
                "                   </table>" +
                "               </body></head></html>");
    }
//    client server
    public Movie getMovie(String name){
        Movie result = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://foo.com/"))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String httpBody = response.body();
            ObjectMapper mapper = new ObjectMapper();
            mapper.readValue(httpBody, Movie.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

}
