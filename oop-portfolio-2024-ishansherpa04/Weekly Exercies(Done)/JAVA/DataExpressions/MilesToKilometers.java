package DataExpressions;

import java.util.Scanner;

public class MilesToKilometers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();
        
        // Formula to convert miles to kilometer i.e KM = M * 1.609344
        
        double kilometers = miles * 1.60935;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

	}

}
