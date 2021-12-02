package Program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;

public class Repo {
    URL url = new URL("http://example.com");
    HttpURLConnection con;

    {
        try {
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Repo() throws MalformedURLException {
    }
}
