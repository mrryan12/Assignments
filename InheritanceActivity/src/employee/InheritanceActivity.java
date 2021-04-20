package employee;

public class InheritanceActivity {

	public static void main(String[] args) {

		Manager manager = new Manager(126534,"peter","chennai India",237844,65000);
		manager.calculateSalary();
		manager.calculateTransportAllowance();
		Trainee trainee = new Trainee(2984,"jack","Mumbai India",442085,45000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();
	}

}
