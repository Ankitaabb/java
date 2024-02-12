import java.io.File;
import java.io.IOException;

public class seven {
    public static void main(String[] args) throws IOException{
        File f = new File("raja.text");
        boolean b = f.isHidden();
        System.out.println(b);
}
}
