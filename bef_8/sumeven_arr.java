import java.util.Scanner;

public class sumeven_arr {
    public static void main(String[] args) {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("enter" + size + "no. of elements");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }

}
