package pcode;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        double R = Math.sqrt(num);
        System.out.println("the square root is" +R);
        sc.close();

    }
    
}
