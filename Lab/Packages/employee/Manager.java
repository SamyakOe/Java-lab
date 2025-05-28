package employee;
public class Manager extends Employee{
    private String department;
    public Manager(String name, int emp_id, int salary, String department){
        super(name, emp_id, salary);
        this.department=department;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Department: "+department);
    }
}
