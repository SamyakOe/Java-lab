
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/java";
        ;
        String user = "test";
        String password = "password123";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database");

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
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
