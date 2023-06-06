package DataTypesAndDataTypeConversion;

public class Employee {
	
	/*
	 * Constructors are used to initialize the variables (To force the user)
	 * Constructor should be of same class name
	 * 
	 * 2 types of Parameterization
	 * 1. parameterization
	 * 2.Non parameterization
	 * */
	int empId;
	String empName;
	int empCNIC;
	
	public Employee(int id, String name) {
		empId = id;
		empName = name;
		
		
	}
	public Employee(int id, String name, int CNIC) {
		empId = id;
		empName = name;
		empCNIC = CNIC ;
		
	}
	
	public void info() {
		System.out.println("Usman");
		
	}
	

}
