import java.util.*;

import javax.print.DocFlavor.STRING;

class Student {
    int sid;
    String sname;

    Student(int i, String n)

    {
        sid = i;
        sname = n;
    }
}

public class st {
    public static void main(String[] args) {
        Student s1 = new Student(10 , "raja");
        Student s2 = new Student(20 , "aja");

        ArrayList<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);

        Iterator i = li.iterator();
        while(i.hasNext()){
            Student s = (Student)i.next();
            System.out.println("sid :"   +s.sid+"  name: "+s.sname);
        }

    }

}
