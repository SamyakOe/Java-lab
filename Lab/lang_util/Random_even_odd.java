package lang_util;

import java.util.Random;

public class Random_even_odd {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            int num = rand.nextInt(100) + 1;
            if (num % 2 == 0)
                System.out.println(num + " is even number");
            else
                System.out.println(num + " is odd number");
        }
    }
}