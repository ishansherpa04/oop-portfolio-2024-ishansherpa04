package Frim;

public class Manager extends Employee{
	public Manager(String name) {
        super(name, "Manager");
    }

    
    public void takeVacation() {
        System.out.println("Manager " + name + " is taking a month-long vacation.");
    }
}

