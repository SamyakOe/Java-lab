package Exception_handling;
import java.util.Arrays;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        int[] arr={1,3,6,3,1,8,9};
        Scanner input = new Scanner(System.in);
        System.out.println("Elements of the Array: "+Arrays.toString(arr));
        System.out.println("Enter the index of array to access :");
        int i=input.nextInt();
        input.close();
        try {
            System.out.println("Value at index "+i+" is "+arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't retrieve data!! Invalid array index!");
        }
    }
}
