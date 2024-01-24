package pcode;

import java.util.Scanner;

public class addnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("enter another number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of numbers is: " + sum);
        sc.close();
    }
}
