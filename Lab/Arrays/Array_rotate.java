import java.util.Arrays;
import java.util.Scanner;
public class Array_rotate {
    public static void main(String[] args) {
        int[] arr= {2,3,5,6,45,73,21};
        int start, end;
        Scanner input=new Scanner(System.in);
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Enter the nth position:");
        int n=input.nextInt();
        input.nextLine();
        System.out.print("Enter the direction (left or right):");
        String direction = input.nextLine();
        input.close();
        if(direction.equals("left")){
            start=0;
            end=n;
            while(start<end){
                rotate(start,end,arr);
                start++;
                end--;
            }
        }
        else if(direction.equals("right")){
            start=n+1;
            end=arr.length-1;
            while(start<end){
                rotate(start,end,arr);
                start++;
                end--;
            }
        }
        else
            System.out.println("Invalid Input");
        System.out.println("\nArray: "+Arrays.toString(arr));
    }
    static void rotate(int n1, int n2, int[]arr){
        int temp = arr[n2];
        arr[n2]=arr[n1];
        arr[n1]=temp;
    }
}
