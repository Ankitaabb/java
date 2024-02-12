import java.io.*;

public class two {
    public static void main(String[] args) throws IOException {
        File f = new File("raja.text");
        String name = f.getName();
        System.out.println(name);
        f.createNewFile();
    }
}
