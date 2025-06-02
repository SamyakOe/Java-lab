package FIle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        try {
            File file = new File("File/student.txt");
            Scanner read = new Scanner(file);
            int count = 0;
            while (read.hasNext()) {
                read.next();
                count++;
            }
            read.close();
            System.out.println("Total number of words in the file: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
            e.printStackTrace();
        }
    }
}
