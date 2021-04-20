package classes_and_objects;

import java.util.Scanner;

public class Employee_highestSal {

	private int emp_no;
	private String name;
	private String department;
	private double salary;

	public Employee_highestSal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee number");
		emp_no = sc.nextInt();

		System.out.println("Enter employee name");
		name = sc.next();

		System.out.println("Enter employee Department");
		department = sc.next();

		System.out.println("Enter employee salary");
		salary = sc.nextInt();

	}

	public static void main(String[] args) {
		Employee_highestSal e1 = new Employee_highestSal();
		Employee_highestSal e2 = new Employee_highestSal();
		Employee_highestSal e3 = new Employee_highestSal();
		Employee_highestSal e4 = new Employee_highestSal();
		Employee_highestSal e5 = new Employee_highestSal();
		Employee_highestSal e6 = new Employee_highestSal();
		Employee_highestSal e7 = new Employee_highestSal();
		Employee_highestSal e8 = new Employee_highestSal();
		Employee_highestSal e9 = new Employee_highestSal();
		Employee_highestSal e10 = new Employee_highestSal();

		Employee_highestSal employee[] = { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 };

		for (int i = 0; i < employee.length; i++) {

			System.out.println(i+1 + " employee number" + employee[i].emp_no);
			System.out.println(i+1 + " employee name " + employee[i].name);
			System.out.println(i+1 + " employee Department" + employee[i].department);
			System.out.println(i+1 + " employee salary" + employee[i].salary);
			System.out.println("");

		}

		String n = highest(employee);
		System.out.println("Highest salary employee is " + n);

	}

	public static String highest(Employee_highestSal employee[]) {
		double high = employee[0].salary;
		String n = "";
		for (int i = 1; i < employee.length; i++) {
			if (employee[i].salary > high) {
				high = employee[i].salary;
				n = employee[i].name;
			}
		}
		return n;
	}

}
