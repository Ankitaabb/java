public class selection_sort_array {
    public static void printarray(int arr[]) {
        for(int i=0 ; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {25,17,31,13,2};

        for(int i=0; i<arr.length-1 ;i++){
            for(int j=0; j<arr.length-1-i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarray(arr);
    }
}
 