package hospital;

public class Nurse extends Employee {
	private int numPatients;

    public Nurse(String name, String empNumber, int numPatients) {
        super(name, empNumber);
        this.numPatients = numPatients;
    }

    public void takeCareOfPatients() {
        System.out.println("Nurse " + name + " Emp#" + empNumber + " has " + numPatients + " patients");
    }

}

