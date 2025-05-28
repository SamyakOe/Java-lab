package shapes;

public class Triangle {
    public double a;
    public double b;
    public double c;
    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double calArea(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double calPerimeter(){
        return a+b+c;
    }
    
}
