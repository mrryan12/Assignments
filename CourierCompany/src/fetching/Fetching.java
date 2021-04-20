package fetching;

import java.util.ArrayList;

import employees.Employees;

public class Fetching implements Fetch {
	
	private ArrayList<Employees> employees = new ArrayList<>();
	
	
	public void addEmployee(Employees employee)
	{
      employees.add(employee);
	}

	
	public void employeeDetails(double id) {
		
		for(Employees employee: employees)
		{
			if(id == employee.getEmployeeId())
			{
		    System.out.print(employee.getEmployeeName());
		    System.out.print(","+ employee.getSalary());
		    System.out.println("," + employee.getDesignation());
			}
		    
		}
	}

	
	public void belongingFinance() {
		
		System.out.println("All employees Details Belonging to finanace Department");
		
		for(Employees employee: employees)
		{
		    System.out.print("name = " + employee.getEmployeeName());
		    System.out.print(", Id = " + employee.getEmployeeId());
		    System.out.print(", Salary = " + employee.getSalary());
		    System.out.print(", Designation = "+ employee.getDesignation());
		    System.out.println("");
		    
		}

	}


	public void totalSalary() {
    
		double sal = 0;
		for(Employees employee: employees)
		{
			sal += employee.getSalary() ; 
		}
		System.out.println("total Salary of all employees = " + sal);
	}


	public void totalSalaryOfManager() {
		
		double salary = 0;
		for(Employees employee: employees)
		{
			if(employee.getDesignation() == "Manager")
			{
		      salary +=employee.getSalary();
			}
		    
		}
		System.out.println("Total salary of all Manager = "+salary);

	}

}
