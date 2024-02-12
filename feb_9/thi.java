import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class thi {
     public static void main(String[] args) throws IOException{
        File f = new File("raja.txt");
        String s = "hello hi bye";
        byte[] data = s.getBytes();
        FileOutputStream fout = new FileOutputStream(f);
        fout.write(data);
        fout.close();
}
}