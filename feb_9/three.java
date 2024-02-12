import java.io.File;
import java.io.IOException;

public class three {
    public static void main(String[] args) throws IOException {
        File f = new File("raja.text");
        String name = f.getParent();
        System.out.println(name);
        f.createNewFile();
}
}
