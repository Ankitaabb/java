import java.util.InputMismatchException;
import java.util.Scanner;

public class exp_ex {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("plz enter the number");
            int i = sc.nextInt();            
            int j = sc.nextInt();
            System.out.println("sum :" + (i+j) +"  div" + (i/j));            
        
        }
        catch(InputMismatchException e){
            System.out.println("plz enter number  ");
        }
        catch(ArithmeticException e){ 
            System.out.println(" plz enter non zero  "); 
        }
    }
    
}
