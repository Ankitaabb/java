import java.util.Scanner;

public class avrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of values: ");
        int totalValues = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= totalValues; i++) {
            System.out.print("Enter value #" + i + ": ");
            int value = sc.nextInt();
            sum += value;
        }
        double average = (double) sum / totalValues;
        System.out.println("The average is: " + average);
        sc.close();
    }
}
