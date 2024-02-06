import java.util.Scanner;
public class jagged_ar {
    public static void main(String[] args) {
        
        int[][]arr = new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[1];
        
        arr[0][0]=22;
        arr[0][1]=88;
        arr[1][0]=99;
        arr[1][1]=44;
        arr[1][2]=10;
        arr[2][0]=20;
        System.out.println(arr[1][1]);
    }
    
}
