package Frim;

public abstract class Employee {
	 protected String name;
	    protected String role;

	    public Employee(String name, String role) {
	        this.name = name;
	        this.role = role;
	    }
	    
	    
	    public void takeVacation() {
	        System.out.println(role + " " + name + " is taking a vacation.");
	    }

}
