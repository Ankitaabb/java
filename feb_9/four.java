import java.io.File;
import java.io.IOException;

public class four {
     public static void main(String[] args) throws IOException {
        File f = new File("raja.text");
        String path = f.getPath();
        System.out.println(path);
        f.createNewFile();
}
}
