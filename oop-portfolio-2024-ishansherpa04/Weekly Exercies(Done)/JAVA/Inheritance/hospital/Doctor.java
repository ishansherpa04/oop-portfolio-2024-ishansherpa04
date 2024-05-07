package hospital;

public class Doctor extends Employee {
	private String specialism;

    public Doctor(String name, String empNumber, String specialism) {
        super(name, empNumber);
        this.specialism = specialism;
    }

    public void performCheckup() {
        System.out.println("Doctor " + name + " Emp#" + empNumber + " specializes in " + specialism);
    }
	

}
