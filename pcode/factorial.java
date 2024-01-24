package pcode;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();
        for(i=1 ; i<=num ; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    
}
