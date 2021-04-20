package employee;

public class Employee {

	 private long employeeId;
	 private String employeeName;
	 private String employeeAddress;
	 private double basicSalary;
	 public long getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeAddress() {
		return employeeAddress;
	}



	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}



	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public int getEmployeePhone() {
		return employeePhone;
	}



	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}



	public double getSpecialAllowance() {
		return specialAllowance;
	}



	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}



	public double getHRA() {
		return HRA;
	}



	public void setHRA(double hRA) {
		HRA = hRA;
	}



	private int employeePhone;
	 private double specialAllowance = 250;
	 private double HRA = 1000.50;
	
	public Employee()
	{
		
	}

	

	public Employee(long employeeId,String employeeName,String employeeAddress,int employeePhone,double basicSalary) {
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		
	}



	public void calculateSalary()
	{
		double salary =  basicSalary + HRA + specialAllowance;
		System.out.println(salary);
	}
	
	public void calculateTransportAllowance()
	{
		double salary  = this.getBasicSalary();
		double allowance = salary + (salary*10/100);
		System.out.println("Total salary for Transport allowance is "+allowance);
	}

}
