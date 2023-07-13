package backend;

import com.google.gson.Gson;

import java.io.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

public class backend {
    static Gson JSONProcessor = new Gson();

    public static String generateSourceCode(String postTitle, String pageTitle, String content){
        String temp;
        String base = "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
                "    <link rel=\"icon\" href=\"ICON\" />\n" +
                "    <title>@WINDOW_TITLE</title>\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"/style.css\" />\n" +
                "    <main>\n" +
                "      <h1>\n" +
                "        @TITLE\n" +
                "      </h1>\n" +
                "      <fade>@DATE</fade>\n" +
                "      <p>\n" +
                "        <pre>@CONTENT\n" +
                "      </pre></p>\n" +
                "    </main>\n" +
                "    <sidebox>\n" +
                "      <p>\n" +
                "        <a href=\"/home.html\">home</a><br />\n" +
                "        <a href=\"/blog.html\">back to blog</a><br />\n" +
                "        <a href=\"/contact.html\">contact</a><br>\n" +
                "        <a href=\"/changelog.html\">changelog</a>\n" +
                "      </p>\n" +
                "      <p>\n" +
                "        :)\n" +
                "      </p>\n" +
                "    </sidebox>\n" +
                "  </head>\n" +
                "</html>\n";

        LocalDate currentDate = LocalDate.now();
        String date = currentDate.getDayOfMonth() + " " + currentDate.getMonth() + " " + currentDate.getYear();
        temp = base.replaceAll("@WINDOW_TITLE", pageTitle);
        base = temp.replaceAll("@DATE", date);
        temp = base.replaceAll("@TITLE", postTitle);
        base = temp.replaceAll("@CONTENT", content);

        return base;
    }

    public static String generateHyperlink(String pageName, String postName){
        String base = "<a href=\"blogposts/@PAGENAME.html\">@POSTNAME</a><br />";
        String temp;

        temp = base.replaceAll("@PAGENAME", pageName);
        base = temp.replaceAll("@POSTNAME", postName);

        return base;
    }

    public static blogpost loadBlogpost(File fileL) {

        String filepath = fileL.getAbsolutePath();
        System.out.println(filepath);
        ArrayList<String> temp = new ArrayList();
        try {
            BufferedReader file = new BufferedReader(new FileReader(filepath));
            while (file.ready()) {
                temp.add(file.readLine());
            }//end while
        } catch (IOException e) {
            System.out.println(e);
        }

        return JSONProcessor.fromJson(temp.get(0), blogpost.class);
    }

    public static void saveBlogpost(String filename, blogpost p) {
        try {
            PrintWriter file = new PrintWriter( new FileWriter(filename)  ) ;
            file.println(JSONProcessor.toJson(p));
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void saveDemo(String filepath, String data) {
        try {
            PrintWriter file = new PrintWriter( new FileWriter(filepath)  ) ;
            file.println(data);
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
