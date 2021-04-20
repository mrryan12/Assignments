package main;

import employees.Employees;
import fetching.Fetching;

public class TestMain {

	public static void main(String[] args) {
		
		Employees e1 = new Employees("rehan",1,12000,"Manager");
		Employees e2 = new Employees("rehanans",2,15000,"Manager");
		Employees e3 = new Employees("rehanAnsari",3,20000,"CEO");
		
		Fetching f = new Fetching();
		f.addEmployee(e1);
		f.addEmployee(e2);
		f.addEmployee(e3);
		
		f.belongingFinance();
		f.totalSalary();
		f.totalSalaryOfManager();
		f.employeeDetails(2);

	}

}
