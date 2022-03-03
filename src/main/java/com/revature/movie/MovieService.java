package com.revature.movie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpRequest;

/**
 * Created html for the server. To display a search bar and a link.
 */

public class MovieService extends HttpServlet {
    public MovieService(){}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    {
        String HTMLForm = "<Html>\n" +
                "<Head>\n" +
                "    <Title>Search Movies" +
                "</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "    <h1>Movie Search</h1>\n" +
                "    " +
                "<Form action='movie' method='get'>\n" +
                "        <input type='name' name='find'/>\n" +
                "        <input type='submit' value='Search'/>\n" +
                "        <a href='movie'>See Movie List</a>\n" +
                "    </Form>\n" +
                "</Body>\n" +
                "</Html>";
        try {
            resp.getWriter().println(HTMLForm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
