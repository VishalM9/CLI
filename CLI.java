import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.lang.StringBuffer;
public class CLI{

    public static void main(String args[]) throws IOException{
        String link = "https://en.wikipedia.org/wiki/";
        String searchterm= args[0];
        link=link+searchterm;
        String file=args[1];
        //file=file.Writer();
        try{
         URL url = new URL(link);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                int responseCode = connection.getResponseCode();

        if(responseCode == 200){
        BufferedWriter b = new BufferedWriter(new FileWriter(file,true));
        b.write(link+"\n");
        b.close();
        }
        else
                    System.out.println("Page doesn't exist! Verify your keyword again!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    }


}