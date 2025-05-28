package employee;
public class Clerk extends Employee{
    private String shift;
    public Clerk(String name, int emp_id, int salary, String shift){
        super(name, emp_id, salary);
        this.shift=shift;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Shift: "+shift);
    }
}