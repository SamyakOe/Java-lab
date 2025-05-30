import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "test";
        String password = "password123";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database");

            int choice;
            Scanner input = new Scanner(System.in);

            do {
                System.out.println("MENU:");
                System.out.println("1: Update Name and Mark");
                System.out.println("2: Display Table");
                System.out.println("3: Exit");
                System.out.print("Choose one option:");
                choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the ID of the student: ");
                        int updateId = input.nextInt();
                        System.out.print("Enter the marks: ");
                        int updateMarks = input.nextInt();
                        input.nextLine();
                        PreparedStatement pstmt = conn
                                .prepareStatement("UPDATE students SET marks = ? WHERE id = ?");
                        pstmt.setInt(1, updateMarks);
                        pstmt.setInt(2, updateId);
                        int rows = pstmt.executeUpdate();
                        if (rows > 0) {
                            System.out.println("Student Updated Successfully");
                        } else {
                            System.out.println("No record found for given id");
                        }
                        pstmt.close();
                        break;
                    case 2:
                        Statement stmt = conn.createStatement();
                        ResultSet res = stmt.executeQuery("SELECT * FROM students");

                        System.out.printf("%-5s %-20s %-5s%n", "ID", "Name", "Marks");
                        System.out.println("------------------------------");
                        while (res.next()) {
                            int id = res.getInt("id");
                            String name = res.getString("name");
                            int marks = res.getInt("marks");
                            System.out.printf("%-5d %-20s %-5d%n", id, name, marks);
                        }
                        res.close();
                        stmt.close();
                        break;
                    case 3:
                        System.out.println("Exiting the program...");
                        break;

                    default:
                        System.out.println("Invalid Entry");
                        break;
                }

            } while (choice != 3);

            conn.close();
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
