import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bff {
    public static void main(String[] args) throws IOException{
        // InputStreamReader sr= new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(sr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name...");
        String name = br.readLine();
        System.out.println(name);
    }    
}
