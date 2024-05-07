package ClassObjects;

import java.util.Scanner;
import java.util.Random;

public class PinEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        // Convert the PIN to hexadecimal
        String hexPin = Integer.toHexString(pin);

        // Generate two random numbers greater than 1000 and less than 65536
        int random1 = random.nextInt(64536) + 1000; // Range: 1000 to 65535
        int random2 = random.nextInt(64536) + 1000; // Range: 1000 to 65535

        // Convert the random numbers to hexadecimal
        String hexRandom1 = Integer.toHexString(random1);
        String hexRandom2 = Integer.toHexString(random2);

        // Sandwich the converted pin between the two random hexadecimal numbers
        String encryptedPin = hexRandom1 + hexPin + hexRandom2;

        System.out.println("Your encrypted pin number is " + encryptedPin + ".");
    }
}