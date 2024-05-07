package DataExpressions;

import java.util.Scanner;

public class SquareCalculations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square's side: ");
        int side = scanner.nextInt();
        
        // To calculate perimeter
        int perimeter = 4 * side;
        
        // To calculate area
        int area = side * side;
        
        
        System.out.println("The perimeter of the square is: " + perimeter);
        System.out.println("The area of the square is: " + area);
	}

}
