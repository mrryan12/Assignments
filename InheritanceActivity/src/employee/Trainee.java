package employee;

public class Trainee extends Employee {
	

	public Trainee(long employeeId,String employeeName ,String employeeAddress,int employeePhone,double basicSalary)
	{
		
		  super.setEmployeeId(employeeId);	
		  super.setEmployeeName(employeeName);
	      super.setEmployeeAddress(employeeAddress);
	      super.setEmployeePhone(employeePhone);
	      super.setBasicSalary(basicSalary);
	      super.setSpecialAllowance(10);
	
	}
	


}
