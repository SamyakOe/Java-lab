package String_Method;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String original = input.nextLine();
        System.out.println("Enter the word to be replaced:");
        String targetWord= input.nextLine();
        System.out.println("Enter the word to replace");
        String replacement= input.nextLine();
        String res=original.replaceAll("\\b"+targetWord+"\\b", replacement);
        System.out.println("String after replacement:");
        System.out.println(res);
        input.close();
    }
}
