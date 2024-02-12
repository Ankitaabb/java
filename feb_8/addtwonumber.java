import java.io.*;

public class addtwonumber {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter two number..");
                int i = Integer.parseInt(br.readLine());
                int j = Integer.parseInt(br.readLine());
                int r = i+j;
                System.out.println(r);

    }
    
}
