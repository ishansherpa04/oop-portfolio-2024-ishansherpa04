package Frim;

public class Developer extends Employee {
	public Developer(String name) {
        super(name, "Developer");
    }

    
    public void takeVacation() {
        System.out.println("Developer " + name + " is taking a month-long vacation.");
    }

}
