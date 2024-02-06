import java.util.Scanner;

public class binarry_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to search : ");
        int key=sc.nextInt();

        int index=binarysearch(arr,key);
        if(index != -1){
            System.out.println("element found at" + index);
        }
        else{
            System.out.println("element not found in the array");
        }
    }
    public static int binarysearch(int[] arr , int key){
        for(int i=0; i<arr.length-1 ;i++){
            for(int j=0; j<arr.length-1-i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int l=0;
        int h=arr.length-1;
        int mid=0;
        while(l<=h){
            mid = (l+h)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key <= arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
        
    } 
}
