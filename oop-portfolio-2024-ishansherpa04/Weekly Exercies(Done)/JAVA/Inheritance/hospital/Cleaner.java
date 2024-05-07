package hospital;

public class Cleaner extends Employee {
	private String department;

    public Cleaner(String name, String empNumber, String department) {
        super(name, empNumber);
        this.department = department;
    }

    public void clean() {
        System.out.println("Cleaner " + name + " Emp#" + empNumber + " of " + department + " is sweeping");
    }


}
