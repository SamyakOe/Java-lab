package Collection_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.println("Enter 10 integer values:");
        for(int i=0;i<10;i++){
            int num=input.nextInt();
            arr.add(num);
        }
        System.out.println("The entered values in array list:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        input.close();
    }
}
