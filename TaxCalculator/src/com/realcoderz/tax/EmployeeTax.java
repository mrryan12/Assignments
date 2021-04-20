package com.realcoderz.tax;

public class EmployeeTax {
	
	public static void main(String[] args)
	{
		TaxCalculator tc = new TaxCalculator();
		tc.setCitizenship(true);
		tc.setBasicSalary(25000);
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
		tc.setCitizenship(true);
		tc.setBasicSalary(125000);
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
	}

}
