package shapes;

public class Rectangle {
    public double length;
    public double breadth;
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calArea(){
        return length*breadth;
    }
    public double calPerimeter(){
        return 2*(length+breadth);
    }
}
