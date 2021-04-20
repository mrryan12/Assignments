package employees;

public class Employees {
	
	private String employeeName ;
	private int employeeId ;
	private double salary ;
	private String designation;
	
	public Employees(String employeeName, int employeeId, double salary, String designation) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.designation = designation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

}
