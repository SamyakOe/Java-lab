package lang_util;
import java.util.Scanner;
public class Area_circumference {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius=input.nextDouble();
        double area=Math.PI*Math.pow(radius, 2);
        double circumference=2*Math.PI*radius;
        System.out.printf("Area of Circle: %.2f\n",area);
        System.out.printf("Circumference of Circle: %.2f",circumference);
        input.close();
    }
}
