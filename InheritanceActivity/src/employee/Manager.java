package employee;

public class Manager extends Employee {
	

	public Manager(long employeeId,String employeeName ,String employeeAddress,int employeePhone,double basicSalary)
	{
		
	  super.setEmployeeId(employeeId);	
	  super.setEmployeeName(employeeName);
      super.setEmployeeAddress(employeeAddress);
      super.setEmployeePhone(employeePhone);
      super.setBasicSalary(basicSalary);
	}

	
	public void calculateTransportAllowance()
	{
		double salary  = this.getBasicSalary();
		double allowance = salary + (salary*15/100);
		System.out.println("Total salary with Transport allowance for manager is "+allowance);
	}

}
