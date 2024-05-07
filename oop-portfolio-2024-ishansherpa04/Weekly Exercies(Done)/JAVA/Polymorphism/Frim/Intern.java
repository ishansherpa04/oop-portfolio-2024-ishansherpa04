package Frim;

public class Intern extends Employee{
	public Intern(String name) {
        super(name, "Intern");
    }

    
    public void takeVacation() {
        System.out.println("Intern " + name + " is taking a month-long vacation.");
    }

}
