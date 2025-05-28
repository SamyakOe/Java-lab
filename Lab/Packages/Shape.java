import shapes.*;
public class Shape {
    public static void main(String[] args) {
        Circle circle=new Circle(14);
        System.out.println("Area of circle with radius "+circle.radius+" is "+circle.calArea());
        System.out.println("Circumference of circle with radius "+circle.radius+" is "+circle.calPerimeter());
        Rectangle rectangle=new Rectangle(5.5,7.5);
        System.out.println("\nArea of rectangle with length "+rectangle.length+" and breadth "+rectangle.breadth+" is "+rectangle.calArea());
        System.out.println("Perimeter of rectangle with length "+rectangle.length+" and breadth "+rectangle.breadth+" is "+rectangle.calPerimeter());
        Triangle triangle = new Triangle(4, 3, 5);
        System.out.println("\nArea of Triangle with sides "+triangle.a+", "+triangle.b+" and "+triangle.c+" is "+triangle.calArea());
        System.out.println("Perimeter of Triangle with sides "+triangle.a+", "+triangle.b+" and "+triangle.c+" is "+triangle.calPerimeter());
    }
}
