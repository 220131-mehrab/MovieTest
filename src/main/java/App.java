import java.io.*;
import java.util.Scanner;

import static java.util.PropertyResourceBundle.encoding;

public class App {
    public static void main(String[] args) throws IOException {
       /*String name = "imdb_movie_data.csv";
        File file = new File(name);
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

       /* public static String readFirstLine(InputStream is, String encoding) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("imdb_movie_data.csv"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
            } finally {
                br.close();
            }
        }*/
       /* public static void test() {
            BufferedReader reader;

            try {
                File file = new File("imdb_movie_data.csv");
                reader = new BufferedReader(new FileReader(file));

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        String file = "scr/main/resource/imdb_movie_data.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split("");
                for(String index : row){
                    System.out.printf("%-10", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try{ reader.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
