



public class Main {

    URL url = new URL("https://htf.bewire.org/");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    private static String GET = "GET";
    private static String POST = "POST";
    private static String TEAMID = "6a2a6ada-303c-40c7-a87a-9b9370030e8f";


    public static void main(String args[]){


    }


    public Object sendRequest(String method, String body){
        con.setRequestMethod(method);

    }
}



