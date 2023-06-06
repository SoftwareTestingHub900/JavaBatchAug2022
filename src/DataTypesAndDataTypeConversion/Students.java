package DataTypesAndDataTypeConversion;
//properties
public class Students {
	
	/* Those variables which are not dependent on the object and if you store such types of variables
	 * inside memory it will cost due a lock.
	 * 
	 * Types of Variables
	 * 1. Global: Variables which are declared inside the class but outside the any method
	 * Instance: Global variables without Static keyword 
	 * Static: Global variables with Static keyword 
	 * 
	 * 2. Local: Variables which are declared inside the method
	 * 
	 * 
	 * Types of Methods
	 * 1. Instance: if method is accessing instance variables
	 * 2. Local: if method is accessing is accessing static variables or no variables
	 * */
	int studentid;
	int age;
	String studentName;
	int rollNo;
	String address;
	char gender;
	long mobile;
	float percentage;
    static String SchoolName;
	//behaviors
    
    
    /* Note* Always remember when ever we talk about  "static keyword" means it is associated with the class 
     *not with the object
     *
     */
    
   
   public void showStudentName() {
	   System.out.println(studentName);
	} 
    
   public static void showSchoolName() {
	   System.out.println(SchoolName);
}
   public static void showinfo() {
	   System.out.println("This is just an info");
	
}
		
	public void attendLectues() {
		//method area

	}
	
	public void giveExams() {
		
	}
	
	public void doExcersice() {
	}
	
	//when ever we have to create a object of the class we have to create that in the main method
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.studentName = "Usman";
		System.out.println(s1.studentName);
		
		Students s2 = new Students();
		s2.studentName = "Aleema";
		System.out.println(s2.studentName);
		
	}
}
