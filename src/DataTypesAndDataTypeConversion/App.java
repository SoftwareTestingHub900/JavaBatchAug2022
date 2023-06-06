package DataTypesAndDataTypeConversion;

public class App {
	public static void main(String[] args) {
		Doctors doc = new Doctors();
		doc.markAttendance();
		doc.performSurgery();

		Staff s1 = new Staff();
		s1.markAttendance();
		
	//	s1.performSurgery(); not possible
	//  can I create object of Parent class?
		Parent P = new Parent();
		P.markAttendance();
		
		

	}

}
