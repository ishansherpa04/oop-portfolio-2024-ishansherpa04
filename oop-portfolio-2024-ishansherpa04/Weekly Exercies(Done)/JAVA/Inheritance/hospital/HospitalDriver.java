package hospital;

public class HospitalDriver {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor("John", "D001", "Cardiology");
        Nurse nurse = new Nurse("Alice", "N001", 10);
        Receptionist receptionist = new Receptionist("Emma", "R001");
        Cleaner cleaner = new Cleaner("David", "C001", "Ward A");

        doctor.performCheckup();
        nurse.takeCareOfPatients();
        receptionist.manageReception();
        cleaner.clean();


	}

}
