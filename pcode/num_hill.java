
public class num_hill {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number: ");
        // int n = sc.nextInt();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
            // sc.close();
        }
    }
}
