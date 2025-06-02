package String_Method;

import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("String in uppercase:" + str.toUpperCase());
        System.out.println("String in lowercase:" + str.toLowerCase());
        input.close();
    }
}
