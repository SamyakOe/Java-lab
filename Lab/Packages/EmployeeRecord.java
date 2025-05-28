import employee.*;
public class EmployeeRecord {
    public static void main(String[] args) {
        Manager manager = new Manager("Hari",12800,22000,"Sales Department");
        Clerk clerk = new Clerk("Shivam",12200,13000,"Sales Department");
        System.out.println("Manager Details:");
        manager.display();
        System.out.println("\nClerk Details:");
        clerk.display();
    }
}
