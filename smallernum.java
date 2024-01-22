import java.util.Scanner;
public class smallernum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a small number");
        int num = sc.nextInt();
        while(num > 10) {
            System.out.println("enter a small number");
            num = sc.nextInt();
        }
        System.out.println("thank u .....");
        sc.close();
    }
    
}
