package String_Method;
import java.util.Scanner;
public class Vowel {
    static int countVowel(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=input.nextLine();
        int noOfVowel=countVowel(str);
        System.out.println("No. of vowel in the string= "+noOfVowel);
        input.close();
    }
}
