package records;

public class TestMain {
	
	public static void main(String[] args)
	{
		StudentRecord sr1 = new StudentRecord("rehan","MCA",85);
		StudentRecord sr2 = new StudentRecord("ryan","MCA",75);
		StudentRecord sr3 = new StudentRecord("Ansari","MBA",95);
		
		sr1.setRecord(sr1);
		sr1.setRecord(sr2);
		sr1.setRecord(sr3);
		
		sr1.displayRecord();
		sr1.searchRecord("MCA");
	}

}
