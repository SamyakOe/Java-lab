import mathutils.Calculator;
public class Calculation {
    public static void main(String[] args) {
        int num1=104, num2=65;
        System.out.println("Numbers: "+num1+" and "+num2);
        System.out.println("Addition: "+Calculator.add(num1, num2));
        System.out.println("Subtraction: "+Calculator.subtract(num1, num2));
        System.out.println("Multiplication: "+Calculator.multiply(num1, num2));
        System.out.println("Division: "+Calculator.divide(num1, num2));
    }
}