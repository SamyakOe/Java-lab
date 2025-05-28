import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        input.close();
    }
}