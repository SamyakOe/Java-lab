 public class ComplexNumber {
    float real;
    float imaginary;
    ComplexNumber(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2){
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real=n1.real+n2.real;
        res.imaginary=n1.imaginary+n2.imaginary;
        return res;
    }
    public static ComplexNumber subtract(ComplexNumber n1,ComplexNumber n2){
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real=n1.real-n2.real;
        res.imaginary=n1.imaginary-n2.imaginary;
        return res;
    }
    public static void display(ComplexNumber res){
        System.out.println(res.real+" + i "+res.imaginary);
    }
    public static void main(String[] args) {
        ComplexNumber num1= new ComplexNumber(32,33);
        ComplexNumber num2= new ComplexNumber(21,12);
        System.out.print("First Complex number: ");
        display(num1);
        System.out.print("Second Complex number: ");
        display(num2);
        System.out.print("Addition: ");
        display(add(num1,num2));
        System.out.print("Subtraction: ");
        display(subtract(num1,num2));
    }
}

