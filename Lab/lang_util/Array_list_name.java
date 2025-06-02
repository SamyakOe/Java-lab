package lang_util;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        ArrayList<String> name_list = new ArrayList<>();
        do {
            System.out.println("\nMenu");
            System.out.println("1: Add Name");
            System.out.println("2: Display in Uppercase");
            System.out.println("3: Remove Name");
            System.out.println("4: Exit");
            System.out.print("Enter your choice(1-4): ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name to be added: ");
                    String nameToAdd = input.nextLine();
                    name_list.add(nameToAdd);
                    System.out.println("Name added");
                    break;
                case 2:
                    if (name_list.isEmpty()) {
                        System.out.println("The list is Empty");
                    } else {
                        System.out.println("All Names in Uppercase:");
                        for (String name : name_list)
                            System.out.println(name.toUpperCase());
                    }
                    break;
                case 3:
                    if (name_list.isEmpty()) {
                        System.out.println("List is Empty");
                    } else {
                        System.out.print("Enter the name to be removed: ");
                        String nameToRemove = input.nextLine();
                        if (name_list.remove(nameToRemove)) {
                            System.out.println("Name removed");
                        } else
                            System.out.println("Name not found");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 4);
        input.close();
    }
}
