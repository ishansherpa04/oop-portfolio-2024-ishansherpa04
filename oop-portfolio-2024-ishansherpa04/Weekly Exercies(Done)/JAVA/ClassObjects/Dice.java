package ClassObjects;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        // Create instances of Scanner and Random classes
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter the number of sides for each die
        System.out.print("How many sides does die 1 have? ");
        int sides1 = scanner.nextInt();

        System.out.print("How many sides does die 2 have? ");
        int sides2 = scanner.nextInt();

        // Initialize variables to store the sum of rolls for each die
        int die1Sum = 0;
        int die2Sum = 0;

        // Simulate rolling the dice three times
        for (int i = 1; i <= 3; i++) {
            // Generate random rolls for each die
            int roll1 = random.nextInt(sides1) + 1;
            int roll2 = random.nextInt(sides2) + 1;

            // Update the sum of rolls for each die
            die1Sum += roll1;
            die2Sum += roll2;

            // Print the rolls for each die
            System.out.println("Die 1 " + i + " roll = " + roll1 + ".");
            System.out.println("Die 2 " + i + " roll = " + roll2 + ".");
        }

        // Calculate the average of rolls for each die
        double die1Average = (double) die1Sum / 3;
        double die2Average = (double) die2Sum / 3;

        // Print the sum and average of rolls for each die
        System.out.println("Die 1 rolled a total of " + die1Sum + " and rolled " + die1Average + " on average.");
        System.out.println("Die 2 rolled a total of " + die2Sum + " and rolled " + die2Average + " on average.");
    }
}
