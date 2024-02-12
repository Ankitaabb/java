import java.io.File;
import java.io.IOException;

public class eight {
     public static void main(String[] args) throws IOException{
        File f = new File("raja.text");
        boolean b = f.isDirectory();
        System.out.println(b);
}
}
