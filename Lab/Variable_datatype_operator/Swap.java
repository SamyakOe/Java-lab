import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=input.nextInt();
        System.out.println("Enter the second number:");
        int num2=input.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("1st number= "+num1+" 2nd number= "+num2);
        input.close();
    }
}