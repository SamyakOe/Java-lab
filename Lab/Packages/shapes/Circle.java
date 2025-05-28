package shapes;
public class Circle {
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double calPerimeter(){
        return 2*Math.PI*radius;
    }
}
