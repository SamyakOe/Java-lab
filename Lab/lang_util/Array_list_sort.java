package lang_util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_list_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter 5 integer values:");
        for (int i = 1; i <= 5; i++)
            arr.add(input.nextInt());
        Collections.sort(arr);
        System.out.println("Array list in sorted order:" + arr.toString());
        input.close();
    }
}
