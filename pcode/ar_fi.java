import java.util.Scanner;
public class ar_fi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numer");
        int size = sc.nextInt();
        System.out.println("numbers");
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println("numbers are : " + number[i]);
            
        }
        System.out.println("enter the numer to find :");
        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {

            if (number[i] == x) {
                System.out.println("number find at   :" + i);
            }
        }
    }
}
