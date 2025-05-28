import java.util.Arrays;
import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr={11,2,34,4,54,6,73,8,9,10};
        int i, value;
        boolean found=false;
        System.out.println("The values in the array:\n"+Arrays.toString(arr));
        System.out.println("Enter the value to be searched:");
        value=input.nextInt();
        input.close();
        for(i=0;i<arr.length;i++)
        {
            if(value==arr[i])
            {
                System.out.println("The value "+value+" is located at index "+i);
                found=true;
                break;
            }
        }
        if(found==false)
            System.out.println("The value is not present in the array");
    }
}
