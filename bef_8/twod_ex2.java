import java.util.Scanner;

public class twod_ex2 {
    public static void main(String[] args) {
        int[][] arr;
        System.out.println("pls enter row and coloumn of array :");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        arr = new int[row][col];
        System.out.println("enter" + (row * col) + "no of element");
        for(int i=0; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("elements are");
        for(int i=0; i<row ;i++){
            for(int j=0; j<col ;j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
