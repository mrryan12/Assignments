package com.realcoderz.tax;

public class TaxCalculator {
	private float basicSalary;
	private boolean citizenship;
	private float tax;
	private int nettSalary;
	
	
	public void calculateTax()
	{
		tax = 30*basicSalary/100;
		System.out.println("The Tax of the employee  for  the " +basicSalary +" is " +tax);
	}
    
	public void deductTax()
	{
	   nettSalary = (int)(basicSalary-tax);
	   System.out.println("The nett salary of the employee " +nettSalary);
	}
	public void validateSalary()
	{
		if(basicSalary > 100000)
		{
			citizenship = true;
		}else
		{
			citizenship = false;
		}
		System.out.println("The salary and citizenship eligibility: "+citizenship );
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public boolean isCitizenship() {
		return citizenship;
	}

	public void setCitizenship(boolean citizenship) {
		this.citizenship = citizenship;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public int getNettSalary() {
		return nettSalary;
	}

	public void setNettSalary(int nettSalary) {
		this.nettSalary = nettSalary;
	}
}
