package com;

import java.util.Arrays;

public class SorterDemo {

	public static void main(String[] args) {

		Student s1 = new Student(1, "rehan", 400);
		Student s2 = new Student(2, "ryan", 395);
		Student s3 = new Student(3, "ansari", 390);
		Student s4 = new Student(4, "reh", 385);
		Student s5 = new Student(5, "rya", 387);

		Student s[] = { s1, s2, s3, s4, s5 };

		double d[] = { 22.5, 15.3, 26.4, 23, 27.4 };
		String str = "rehan";

		double[] sortD = sortDouble(d);
		System.out.println("Sorted array is ");
		for (int i = 0; i < sortD.length; i++) {
			System.out.print("," + sortD[i]);
		}
		System.out.println("");
		System.out.println("Sorted string " + sortString(str));

		Student[] student = sortStudent(s);
        System.out.println("Sorted student by rollNo");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getRollNo() + " "+student[i].getName() +" "+ student[i].getMarks());
		}
	}

	public static double[] sortDouble(double[] d) {
		for (int i = 0; i < d.length - 1; i++) {
			double temp = 0;
			if (d[i] > d[i + 1]) {
				temp = d[i];
				d[i] = d[i + 1];
				d[i + 1] = temp;
			}
		}
		return d;
	}

	public static String sortString(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		String st = String.valueOf(arr);
		return st;
	}

	public static Student[] sortStudent(Student st[]) {

		for (int i = 0; i < st.length-1; i++) {

			if (st[i].getRollNo() > st[i+1].getRollNo())
			{
				Student temp = st[i];
				st[i] = st[i - 1];
				st[i - 1] = temp;
			}
		}
		return st;
	}

}

class Student {
	private int rollNo;
	private String name;
	private double marks;

	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}
