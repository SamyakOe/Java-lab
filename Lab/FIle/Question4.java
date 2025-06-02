package FIle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question4 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("File/destination.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("File/student.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            reader.close();
            System.out.println("Contents successfully copied from student.txt to destination.txt");
        } catch (IOException e) {
            System.out.println("Error occured during file copy");
            e.printStackTrace();
        }
    }
}
