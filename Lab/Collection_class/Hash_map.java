package Collection_class;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap=new HashMap<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students to be entered:");
        int n=input.nextInt();
        input.nextLine();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the Name of the student "+i+": ");
            String name=input.nextLine();
            System.out.print("Enter the Marks of the student "+i+": ");
            int marks=input.nextInt();
            input.nextLine();
            hashmap.put(name, marks);
        }
        System.out.print("Enter the student's name to retrieve marks: ");
        String retrieveName=input.nextLine();
        if(hashmap.containsKey(retrieveName)){
            System.out.println("Marks of "+retrieveName+": "+hashmap.get(retrieveName));
        }
        else{
            System.out.println("Marks of "+retrieveName+": not found!!");
        }
        input.close();
    }
}
