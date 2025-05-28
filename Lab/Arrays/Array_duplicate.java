import java.util.Arrays;
public class Array_duplicate {
    public static void main(String[] args) {
        int arr[]={5,7,76,4,23,5,7};
        int new_arr[]= new int[arr.length];
        int k=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                new_arr[k]=arr[i];
                k++;
            }
        }
        new_arr[k]=arr[arr.length-1];
        System.out.println("Array before deletion:" + Arrays.toString(arr));
        System.out.println("Array after deletion:"+Arrays.toString(Arrays.copyOf(new_arr,k+1)));
    }   
}
