package records;

import java.util.ArrayList;

public class StudentRecord implements Records {
	private String StudentName;
	private String StudentCourseName;
	private double StudentMarks;

	private ArrayList<StudentRecord> record = new ArrayList<>();

	public StudentRecord(String studentName, String studentCourseName, double studentMarks) {
		StudentName = studentName;
		StudentCourseName = studentCourseName;
		StudentMarks = studentMarks;
	}

	public String getStudentName() {
		return StudentName;
	}

	public String getStudentCourseName() {
		return StudentCourseName;
	}

	public double getStudentMarks() {
		return StudentMarks;
	}

	public void setRecord(StudentRecord sr) {
		record.add(sr);
	}

	public void displayRecord() {
		for (StudentRecord rs : record) {
			System.out.print(rs.getStudentName() + " , " +rs.getStudentCourseName()+" , " + rs.getStudentMarks());
		    System.out.println("");
		}

	}

	public void searchRecord(String course) {
		System.out.println("All record related to " + course);
		double d = record.get(1).getStudentMarks();
		String name =null;
		for(int i=0;i<record.size();i++) 
		{
		  if(record.get(i).getStudentCourseName() == course){
	    	System.out.println(record.get(i).getStudentName() +", "+record.get(i).getStudentCourseName() + 
	    		" ,"+	record.get(i).getStudentMarks());
		  }
		  if(record.get(i).getStudentMarks() > d) {
			  d = record.get(i).getStudentMarks();
			  name = record.get(i).getStudentName();
		  }
		}
		System.out.println("The highest marks student is "+name +" with "+ d);
	}

}
