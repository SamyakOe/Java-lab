package Exception_handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = scanner.nextLine();
        try {
            int age = Integer.parseInt(input);
            scanner.close();
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be Negative");
            }
            System.out.println("Your age is: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a number");
        }
    }
}
