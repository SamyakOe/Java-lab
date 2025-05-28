import java.util.Arrays;
public class Min_max {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Values of the array:\n"+Arrays.toString(arr));
        System.out.println("Minimum value= "+min(arr));
        System.out.println("Maximum value= "+max(arr));
    }
    static int min(int array[]){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i])
                min=array[i];
        }
        return min;
    }
    static int max(int array[]){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i])
                max=array[i];
        }
        return max;
    }
}
