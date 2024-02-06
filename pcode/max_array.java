public class max_array {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 15};
        int max = findMax(arr);
        System.out.println("Maximum value in the array: " + max);
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
