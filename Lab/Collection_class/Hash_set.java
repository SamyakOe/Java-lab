package Collection_class;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> hashset=new HashSet<>();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 6 words (duplicates will be ignored):");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter word " + i + ": ");
            String word = input.nextLine();
            hashset.add(word); 
        }

        System.out.println("\nWords stored in the HashSet:");
        for (String word : hashset) {
            System.out.println(word);
        }

        System.out.println("\nNote: Duplicate entries are not stored in a HashSet.");
        System.out.println("So, if you entered any duplicate word(s), it/they appeared only once.");
        
        input.close();
    }
}
