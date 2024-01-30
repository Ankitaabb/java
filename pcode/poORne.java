

import java.util.Scanner;

class pORne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is positive");
        }
        sc.close();
    }
}