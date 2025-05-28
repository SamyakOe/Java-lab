package String_Method;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        StringBuilder rev= new StringBuilder(str);
        rev.reverse();
        if(str.equals(rev.toString()))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
        input.close();
    }
}
