import java.util.Arrays;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr={-10,9,6,8,5,-7,1,4,2,3};
        int value;
        boolean found=false;
        System.out.println("Enter the value to be searched:");
        value=input.nextInt();
        input.close();
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(value==arr[mid]){
                System.out.println("The value is at index: "+mid);
                found=true;
                break;
            }
            else if(value<arr[mid])
                end=mid-1;
            else if(value>arr[mid])
                start=mid+1;
        }
        if(found==false)
            System.out.println("The value is not present in the array");
    }   
}
