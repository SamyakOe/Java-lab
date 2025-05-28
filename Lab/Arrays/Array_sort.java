import java.util.Arrays;
import java.util.Collections;
public class Array_sort {
    public static void main(String[] args) {
        Integer arr[]={12,2,93,4,35,6,7,8,9};
        System.out.println("Before Sort:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Ascending order:"+Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Descending order:"+Arrays.toString(arr));
    }
}