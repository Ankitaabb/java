import java.util.Scanner;

public class na_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        double sum = 0;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            sum += (1.0 * sign) / i;
            sign = sign * (-1);
        }
        System.out.println(sum);
        sc.close();

    }

}
