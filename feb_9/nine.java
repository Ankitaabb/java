import java.io.File;
import java.io.IOException;

public class nine {
    public static void main(String[] args) {
        File f = new File("raja.text");
        long l = f.length();
        System.out.println(l);
    }

}
