public class greatestofthree {
    public static void main(String[] args) {

        System.out.println("enter 1st number");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("enter 2nd number");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("enter 3rd number");
        int c = new java.util.Scanner(System.in).nextInt();
        if (a >= b && a >= c) {
            System.out.println("greatest is" + a);
        } else if (b >= c && b >= a) {
            System.out.println("greatest is" + b);
        } else {
            System.out.println("greatest is" + c);
        }
    }

}
