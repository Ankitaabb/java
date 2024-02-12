import java.io.File;
import java.io.IOException;

public class ten {
    public static void main(String[] args)throws IOException {
        File f = new File("raja.text");
        long l = f.lastModified();
        System.out.println(l);
    }

}
