package EncapsulationDemo;

public class App {
	public static void main(String[] args) {
		Encapsulation emp1 = new Encapsulation();
	/*	emp1.empName = "Usman";
		System.out.println(emp1.empName);
	*/
		System.out.println(emp1.getEmpid());
		emp1.setEmpid(2);
		System.out.println(emp1.getEmpid());
		
		//------------
		System.out.println(emp1.getName());
		emp1.setName("Usman");
		System.out.println(emp1.getName());
		
	
}
}