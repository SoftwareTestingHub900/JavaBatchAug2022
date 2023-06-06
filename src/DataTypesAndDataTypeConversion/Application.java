package DataTypesAndDataTypeConversion;

public class Application {
	public static void main(String[] args) {
	/* Constructors: if we want to access any information from one class to an
	 * other class e.g: variables and methods we have create a Object
	 * 
	 * */
		//ClassName  referance_veriable = new_keyword constructor
		Employee Emp1 = new Employee(1, "Usman");
		System.out.println("Employee 1 details: ");
		System.out.println(Emp1.empId);
		System.out.println(Emp1.empName);
		System.out.println(Emp1.empCNIC);
		System.out.println("Employee 2 details: ");
		Employee Emp2 = new Employee(2, "Aleema", 23223);
		System.out.println(Emp2.empId);
		System.out.println(Emp2.empName);
		System.out.println(Emp2.empCNIC);
		
		System.out.println("Employee 3 details: ");
		Employee Emp3 = new Employee(4, "Mariyam");
		System.out.println(Emp3.empId);
		System.out.println(Emp3.empName);
		
		
		
		
		
		
	//Note//Using object "Emp1" we can access variables and methods of one class from an other class 
	//For "String" base object it will be always null because String is a class and for 
	//int it will always a "0" default it will always 0	
	
		/*	System.out.println(Emp1.empId);//0
		System.out.println(Emp1.empName);//null
		Emp1.info(); */
		
		//System.out.println("Usman");
		
		
	}

}
