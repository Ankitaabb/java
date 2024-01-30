import java.util.*;

public class name {
    String add(String fname, String lname) {
        return fname + " " + lname;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        String a = sc.next();
        System.out.println("enter last name");
        String b = sc.next();
        name obj = new name();
        String full = obj.add(a, b);
        System.out.println("full name:" + full);
        sc.close();
    }

}
