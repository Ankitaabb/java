public class linear_arr { 
    public static void main(String[] args) {
    int [] arr = new int[]{11,2,9,13,57,45,17,1,90,3};
    System.out.println("enter element to be searched");
    int search = new java.util.Scanner(System.in).nextInt();
    int flag =0;
    for(int i=0; i < arr.length ;i++)
    {
        if(search == arr[i]){
            flag =1;
            break;
        }
    }
    if(flag ==1){
        System.out.println("searching is successful");
    }
    else {
        System.out.println("not found");
    }
}
    
}
