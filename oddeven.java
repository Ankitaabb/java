public class oddeven {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int a = new java.util.Scanner(System.in).nextInt();
        if(a % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();

    }
    
}
