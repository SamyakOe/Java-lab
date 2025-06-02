package Collection_class;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of cities to be entered: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the name of the city " + i + ": ");
            cities.add(input.nextLine());
        }
        System.out.println("Citied entered: " + cities);
        System.out.print("Enter the city to be removed: ");
        String cityToRemove = input.nextLine();
        if (cities.remove(cityToRemove)) {
            System.out.println(cityToRemove + " has been removed");
        } else
            System.out.println(cityToRemove + " not found in the list");
        System.out.println("Final list of cities: " + cities);
        input.close();
    }
}
