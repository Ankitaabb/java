package pcode;

import java.util.Scanner;

public class vowelORconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a letter");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
        sc.close();
    }

}
