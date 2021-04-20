package collegeFaculty;

public class TestMain {

	public static void main(String[] args) {

		PermanentFaculty f1 = new PermanentFaculty();
		PermanentFaculty f2 = new PermanentFaculty();
		PermanentFaculty f3 = new PermanentFaculty();

		f1.setId(1);
		f1.setName("rehan");
		f1.setCourse("MCA");
		f1.setAge(20);
		f1.setSal(20000);
		f1.setBonus(2000);
		f1.setHra(2);

		f3.add(f1);

		f2.setId(2);
		f2.setName("rehanans");
		f2.setCourse("MCA");
		f2.setAge(22);
		f2.setSal(25000);
		f2.setBonus(2000);
		f2.setHra(2);
		f3.add(f2);

		TemporaryFaculty t1 = new TemporaryFaculty();

		t1.setId(1);
		t1.setName("ryan");
		t1.setCourse("MBA");
		t1.setAge(25);
		t1.setSal(20000);
		t1.setDuration("3Month");
		t1.add(t1);

		int p = f3.getTotalCountOfFaculty();
		int t = t1.getTotalCountOfFaculty();

		System.out.println("The total count of faculty is " + (t + p));
		f3.search(1);

		System.out.println("total count of permanent faculty " + p);
		System.out.println("total count of Temorary faculty " + t);

	}

}
