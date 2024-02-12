public class dynamic_arr {
    public static void main(String[] args) {
        java.util.Scanner obj =new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int size = obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter" +size +"no. of elements");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("elements are : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    
}
