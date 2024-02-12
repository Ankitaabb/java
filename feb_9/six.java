import java.io.File;
import java.io.IOException;

public class six {
    public static void main(String[] args) throws IOException{
        File f = new File("raja.text");
        boolean b = f.isFile();
        System.out.println(b);
}
}
