package Frim;

public class Firm {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
        employees[0] = new Manager("John");
        employees[1] = new Developer("Alice");
        employees[2] = new Intern("Bob");

        for (Employee emp : employees) {
            emp.takeVacation();
        }
        
	}
}
