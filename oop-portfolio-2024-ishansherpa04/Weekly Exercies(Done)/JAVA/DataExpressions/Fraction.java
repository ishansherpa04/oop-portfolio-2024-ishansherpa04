package DataExpressions;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        double decimalEquivalent = (double) numerator / denominator;
        System.out.println("The decimal equivalent of " + numerator + "/" + denominator + " is " + decimalEquivalent);

	}

}
