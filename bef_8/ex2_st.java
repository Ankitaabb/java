public class ex2_st {
    public static void main(String[] args) {
        String s1 = "prabin";
        String s2 = "prabin";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String a = new String ("raja");
        String b = new String ("raja");
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a == b);

    }
}
