public class employee2 {
    static String compname;
    static {
        compname = "sdi";
        System.out.println("hello static block");
    }

    public static void main(String[] args) {
        System.out.println("hello main method , company ," + compname);

    }

}
