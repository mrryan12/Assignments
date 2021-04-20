package classes_and_objects;

import java.util.Scanner;

public class Employee {
	static int emp_no;
	static String name;
	static String department;
	static double salary;

	public static void main(String[] args) {

		Employee emp = new Employee();

		System.out.println("Enter the emp_no");
		Scanner sc = new Scanner(System.in);
		emp_no = sc.nextInt();
		System.out.println("Enter the emp_name");
		name = sc.next();
		System.out.println("Enter the Department");
		department = sc.next();
		System.out.println("Enter the salary");
		salary = sc.nextDouble();

		System.out.println("employee no. is " + emp_no);
		System.out.println("employee name is " + name);
		System.out.println("employee department is " + department);
		System.out.println("employee salary is " + salary);
	}
}
