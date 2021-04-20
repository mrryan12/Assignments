package com;

public class StudentDemo {

	public static void main(String[] args)
	{
		StudentDemo sd = new StudentDemo();

		Student s1 = sd.new Student(1,"rehan",400);
		Student s2 = sd.new Student(2,"ryan",395);
		Student s3 = sd.new Student(3,"ansari",390);
		Student s4 = sd.new Student(4,"reh",385);
		Student s5 = sd.new Student(5,"rya",387);

		Student s[] = {s1,s2,s3,s4,s5};

		Student st[] =splitStudentArray(s, 'o');
		for(Student ss : st)
		{
			if(ss != null)
			{
			System.out.println(ss.getName() + " " + ss.getMarks());
			}
		}

	}
	public static Student[] splitStudentArray(Student s[] ,char ch)
	{

		
		if(ch=='o')
		{
			int count = 0;
			Student[] st = new Student[5];
			System.out.println(" numbe is odd ");	
			for(int i=0;i<s.length;i++)
			{
				if (s[i].getMarks() % 2 != 0) 
				{
					st[count++] = s[i];
				}
			}
			return st;
		}
		else if (ch == 'e')
		{
			int count = 0;
			Student[] st = new Student[5];

			System.out.println("number is even");

			for(int i=0;i<s.length;i++)
			{
				if (s[i].getMarks() % 2 == 0) 
				{
					st[count++] = s[i];
				}
			}
			return st;
		} else {
			return null;
		}
	}



	class Student
	{
		private int rollNo ;
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


	}
}
