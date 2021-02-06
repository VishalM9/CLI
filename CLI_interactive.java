import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.lang.StringBuffer;
public class CLI_interactive{

    public static void main(String args[]) throws IOException{
        System.out.println("Enter the search term");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String link = "https://en.wikipedia.org/wiki/";
        String searchterm= str;
        System.out.println("Enter the file where to put the data");
        String str1=br.readLine();
        link=link+searchterm;
        String file=str1;
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
        System.out.println("Link successfully added to our file!");
        }
        else
                    System.out.println("Page doesn't exist! Check your keyword again!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    }


}