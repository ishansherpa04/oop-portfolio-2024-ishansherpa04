package SelectionandIteration;

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        StringBuilder reversedSentence = new StringBuilder();
        Scanner wordScanner = new Scanner(sentence);

        while (wordScanner.hasNext()) {
            String word = wordScanner.next();
            reversedSentence.append(reverseString(word)).append(" ");
        }

        System.out.println("The reversed sentence is: " + reversedSentence.toString().trim());
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}