import java.util.Scanner;

public class jagg_arr {
    public static void main(String[] args) {
        System.out.println("enter the size of row");
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][];
        int total=0;
        for (int i =0; i<row ;i++){
            System.out.println("enter col size of " +i +"th row");
            int col = sc.nextInt();
            arr[i] =new int[col];
            total = total +col;
        }
        System.out.println("enter " +total + " no of element");
        for(int i=0 ; i<row ; i++){
            for(int j=0; j<arr[i].length ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements are :");
        for(int i=0 ; i<row ; i++){
            for(int j=0; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
    }
    
}
}