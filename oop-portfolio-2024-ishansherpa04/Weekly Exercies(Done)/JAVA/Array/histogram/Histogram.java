package histogram;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[10]; // Array to store counts for each range

        System.out.print("Enter integers between 1 and 100 (or 0 to exit): ");

        int input;
        do {
            input = scanner.nextInt();
            if (input >= 1 && input <= 100) {
                counts[(input - 1) / 10]++; // Increment count for the corresponding range
            }
        } while (input != 0);

        // Print the histogram
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d - %2d | ", i * 10 + 1, (i + 1) * 10);
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

