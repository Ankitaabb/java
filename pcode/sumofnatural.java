package pcode;
import java.util.Scanner;
public class sumofnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num ;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }

}
