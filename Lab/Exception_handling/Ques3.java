package Exception_handling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Ques3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name to open:");
        try {
            File file=new File(input.nextLine());
            input.close();
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Invalid file name!");
        }
    }
}
