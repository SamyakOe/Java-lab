public class Employee {
    String name;
    int id;
    String designation;
    int salary;
    Employee(String name, int id, String designation, int salary){
        this.name=name;
        this.id=id;
        this.designation=designation;
        this.salary=salary;
    }
    void getInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Id: "+this.id);
        System.out.println("Designation: "+this.designation);
        System.out.println("Salary: "+this.salary);
    }
    void calculateSal(){
        System.out.println("Annual Salary: "+(this.salary*12));
    }
    public static void main(String[] args) {
        Employee test = new Employee("Samyak", 12, "Student", 1200);
        System.out.println("Employee Details:");
        test.getInfo();
        test.calculateSal();
    }
}
