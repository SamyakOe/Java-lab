import java.util.Arrays;
public class Array_even_odd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int odd=0,even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Array:\n"+Arrays.toString(arr));
        System.out.println("No. of Even numbers= "+even);
        System.out.println("No. of Odd numbers= "+odd);
    }
}
