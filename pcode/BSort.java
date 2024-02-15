public class BSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 7};
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
