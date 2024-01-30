

import java.util.*;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int k = num;
        int s = 0;
        while(num > 0){
            int r = num % 10;
            s = s + (r*r*r);
            num =num/10;
        }
        if(k == s){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not an amstrong");

        }sc.close();
    }
    
}
