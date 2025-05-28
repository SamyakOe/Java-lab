import java.util.Scanner;
public class EvenPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=input.nextInt();
        if(num%2==0 && num>0)
            System.out.println("The number is Even and Positive.");
        else if(num%2==0)
            System.out.println("The number is Even and Negative");
        else if(num>0)
            System.out.println("The number is Odd and Positive");
        else
            System.out.println("The number is Odd and Negative");
        input.close();
    }
}