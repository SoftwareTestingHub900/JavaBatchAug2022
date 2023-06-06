package DataTypesAndDataTypeConversion;

public class StudentApp {
	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.studentName = "Usman";
		s1.SchoolName  = "University of Gujrat";
		
		Students S2 = new Students();
		S2.studentName = "Ishtiaq";
		S2.SchoolName  = "University of Lahore";
		
		System.out.println(s1.studentName);
		System.out.println(s1.SchoolName);
		System.out.println(S2.studentName);
		System.out.println(S2.SchoolName);
	}
}

