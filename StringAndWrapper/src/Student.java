
public class Student {

	public void calculateFeesStructure(Long studentId, Character studentGrade, Double monthlyFees,
			Boolean isScholarshipEligible) {
		 Double fees ;
		if (studentId != 0 && studentGrade == 'A' && isScholarshipEligible == true) {
			fees = monthlyFees - monthlyFees * 10 / 100;
			int i = (int) Math.round(fees);
			System.out.println("10 % of fees is exempted, the calculated fees is " + i);
		} else if (studentId != 0 && studentGrade == 'B' && isScholarshipEligible == true) {
			fees = monthlyFees - monthlyFees * 8 / 100;
			int i = (int) Math.round(fees);
			System.out.println("8 % of fees is exempted, the calculated fees is " + i);
		} else if (studentId != 0 && studentGrade == 'C' && isScholarshipEligible == true) {
			fees = monthlyFees - monthlyFees * 6 / 100;
			int i = (int) Math.round(fees);
			System.out.println("6 % of fees is exempted, the calculated fees is " + i);
		} else if (studentId != 0 && studentGrade == 'A' && isScholarshipEligible == true) {
			fees = monthlyFees - monthlyFees * 4 / 100;
			int i = fees.intValue();
			System.out.println("4 % of fees is exempted, the calculated fees is " + i);
		} else {
			System.out.println("Not Eligible for Exemption");
		}

	}

	public void compareMarks(Long Maths, Double English) {
		Integer math = Maths.intValue();
		Integer english = English.intValue();

		if (math < english) {
			System.out.println("English mark is higher than Maths");
		} else if (math > english) {
			System.out.println("Maths mark is higher than English");
		} else {
			System.out.println("Both Are Equal");
		}
	}

	public void validateFees(Double Fees) {
		if (Double.isInfinite(Fees)) {
			System.out.println("Fees is infinite");
		} else if (Double.isFinite(Fees)) {
			System.out.println("Fees is not infinite");
			byte byteValue = Fees.byteValue();
			System.out.println("The byte value of fees is " + byteValue);
		}
	}
	
	
	public static void main(String[] args) {
		
		Student st = new Student();
		Double d1 = 12500.0; 
		Long l1 = (long)123;
		Long maths = (long)85;
		Double english = 70.0;
		Double Fees = 11250.0;
		
		st.calculateFeesStructure(l1,'A' , d1, true);
		st.compareMarks(maths, english);
		st.validateFees(Fees);
		
	}

}
