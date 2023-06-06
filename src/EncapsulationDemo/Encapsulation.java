package EncapsulationDemo;

public class Encapsulation {

	private int empid; // read - yes, write - no
	private String empName; // read - yes, update - yes
	private String desig; // read - yes, update - no
	private String depar; // read - yes, update - no
	private char gender; // read - yes, update - yes
	private long mobile; // read - yes, update - yes
//
	public int getEmpid() {
		return empid;

	}

	public void setEmpid(int empid) {
		this.empid = empid;

	}

	public String getName() {
		return empName;

	}
//	public String getEmpName() {
//		return empName;
//	}
	public void setName(String empName) {
		this.empName = empName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
//	public int getEmpid() {
//		return empid;
//	}
	public String getDesig() {
		return desig;
	}
	public String getDepar() {
		return depar;
	}

//	public void setName(String name) {
//		//checks
//		/* if there is an update in phone number
//		 * if OTP matches the system
//		 * only then update the mobile number
//		 * else don't update
//		 * */
//		this.empName = name;
//
//	}
	
	

}
