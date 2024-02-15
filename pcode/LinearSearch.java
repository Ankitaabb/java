import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array");
        }
    }
}

