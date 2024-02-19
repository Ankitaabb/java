import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(10);
        v.addElement(10.4f);
        v.addElement("raja");
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o);
        }

    }
}
