package Exception_handling;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter first number:");
            int n1=input.nextInt();
            System.out.println("Enter second number:");
            int n2=input.nextInt();
            int res=n1/n2; 
            System.out.println("Division: "+res);
            input.close();
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by Zero");
        }
    }
}
