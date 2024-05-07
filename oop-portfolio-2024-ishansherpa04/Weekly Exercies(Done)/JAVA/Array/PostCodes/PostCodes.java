package PostCodes;

import java.util.Scanner;

public class PostCodes {
	private static final int MAX_PERSONS = 25;
    private static Person[] persons = new Person[MAX_PERSONS];
    private static int numPersons = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person details (first name, last name, postal code) separated by tabs (or press Enter to finish):");

        while (numPersons < MAX_PERSONS) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split("\t");
            if (parts.length != 3) {
                System.out.println("Invalid input format. Try again.");
                continue;
            }

            String firstName = parts[0];
            String lastName = parts[1];
            String postalCode = parts[2];

            Person person = new Person(firstName, lastName, postalCode);
            persons[numPersons++] = person;
        }

        // Print the list of persons
        System.out.println("\nList of Persons:");
        for (int i = 0; i < numPersons; i++) {
            Person person = persons[i];
            System.out.println(person.getFirstName() + " " + person.getLastName() + " - " + person.getPostalCode());
        }
    }
}