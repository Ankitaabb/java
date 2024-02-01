import java.util.Scanner;

public class m_sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        int sum = getTotal(num1, num2);
        
        System.out.println("Sum: " + sum);
        sc.close();
    }

    public static int getTotal(int number1, int number2)
    {
        return number1 + number2;
    }
}