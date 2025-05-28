package employee;
public class Employee {
    protected String name;
    protected int emp_id, salary;
    public Employee(String name, int emp_id, int salary){
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;
    }
    protected void display(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}