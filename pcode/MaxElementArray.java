public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 7};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum Element in Array: " + max);
    }
}
