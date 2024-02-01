import java.util.Scanner;

public class sinx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter VALUE OF N: ");
        int n = sc.nextInt();
        System.out.println("ENTER VALUE OF X");
        int x = sc.nextInt();
        int sign = 1;
        double res = 0;
        int c = n;
        while (c > 0) {
            res = res + ((sign) * (Math.pow(x, n))) / n;
            n = n + 2;
            sign = sign * (-1);
            c--;
        }
        System.out.println(res);
        sc.close();
    }

}
