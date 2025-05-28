import java.util.Arrays;

public class Array_rev {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Array:\n"+Arrays.toString(arr));
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println("Array reverse:\n"+Arrays.toString(arr));
    }
}
