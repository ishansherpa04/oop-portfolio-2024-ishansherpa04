package hospital;

public class Receptionist extends Employee {
	public Receptionist(String name, String empNumber) {
        super(name, empNumber);
    }

    public void manageReception() {
        System.out.println("Receptionist " + name + " Emp#" + empNumber + " is managing reception");
    }

}
