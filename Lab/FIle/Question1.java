package FIle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Student's Name: ");
        String name=input.nextLine();
        int[] marks=new int[3];
        for(int i=0; i<3;i++){
            System.out.println("Enter Marks of Subject"+(i+1));
            marks[i]=input.nextInt();
        }
        int total=0;
        for(int mark:marks) total+=mark;
        double percentage = total/3.0;
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("student.txt"));
            writer.write("Student's Details:\n");
            writer.write("Name: "+name);
            writer.newLine();
            for(int i=0;i<3;i++){
                writer.write("Marks in Subject"+(i+1)+": "+marks[i]);
                writer.newLine();
            }
            writer.write("Total Marks: "+total);
            writer.newLine();
            writer.write("Percentage: "+percentage);
            writer.close();
            System.out.println("Student info has been saved successfully to student.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
        }
        finally{
            input.close();
        }
        
    }
}
