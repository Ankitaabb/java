import java.io.File;
import java.io.IOException;

public class five {
 
        public static void main(String[] args) throws IOException{
        File f = new File("raja.text");
        boolean b = f.exists();
        System.out.println(b);
    }
}
