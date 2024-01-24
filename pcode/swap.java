package pcode;

public class swap {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        System.out.println("before swapping:");
        System.out.println("x = " + x + " y = " + y);
        
        x = x * y; 
        y = x / y; 
        x = x / y; 
        System.out.println(" after swapping:");
        System.out.println("x = " + x + " y = " + y);
    }
}
