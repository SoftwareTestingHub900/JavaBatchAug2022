package DataTypesAndDataTypeConversion;

public class DataTypeConversionDemo {

	public static void main(String[] args) {

		// this variable value is assigned by some an external integrations
		byte sid;
		// below varibale is declared in the external system
		int studentid = 4;
		// byte = int
		// sid = studentid;

		int i1 = 45;
		long l1 = i1;

		System.out.println("Int value is " + i1);
		System.out.println("long value is " + l1);

		float f1 = 45.95f;
		double d1 = f1;
		f1 = (float) d1; // applied casting

		int i12 = (int) f1;
		System.out.println("Float value is " + f1);
		System.out.println("Int value is " + i12);

		// Char to int

		char c1 = 'A';
		int i17 = c1;
		System.out.println(c1);
		System.out.println(i17);

		// int to char

		int i5 = 97;
		char C3 = (char) i5;
		System.out.println("Value of int is " + i5);
		System.out.println("Value of char is " + C3);

		// Integer to String

		int i11 = 451;
		// if we have to convert integer to string then we will use /call the TOSTRING // method from wrapper class Integer
		String s1 = Integer.toString(i11);
		System.out.println(i11);
		System.out.println(s1);

		// String usage
		System.out.println("Ajay" + "Trainer");
		System.out.println("Ajay" + 10 + 10);
		// Ajay10+10 >> Ajay1010
		System.out.println(10 + 20 + "Ajay" + 10);
		// 30 + Ajay + 10 >> 30Ajay+10 >> 30Ajay10

		// String to int
		String s3 = "141";
		// if we have to convert string to integer then we will use/call the PARSEINT method from wrapper class Integer
		int i13 = Integer.parseInt(s3);
		System.out.println(s3);
		System.out.println(i13);
		
		//If we will try to convert =====> String as a NAME e.g:Ajay to the integer we will get an exception "Number Format Exception " 
		String s4 = "123";
		int i15 = Integer.parseInt(s4);
		System.out.println(s4);
		System.out.println(i15);
		
		// Double to String
		double  D2 = 45;
		String  S7 = Double.toString(D2);
		System.out.println(D2);
		System.out.println(S7);
		
		//boolean is always in the "yes" and "no' form
		//yes = true and no = false  
		
		//boolean
		 boolean isPresent = true;
		// boolean isPresent = false;
	    // boolean b1 = true;	 
		// boolean b2 = "true";
		// boolean b3 = false; //error
		// boolean b4 = "false"; //error
		// boolean b5 = True; // error //case sensitive
		// boolean b6 = False; //error //case sensitive
		// boolean b7 = 1; // error
		// boolean b8 = 0; //error
		 
		 System.out.println(isPresent);
		//System.out.println(ISPRESENT); // case sensitive
/*Object:
 * anything which we see an object
 * Every object has some properties and some behaviors
 * 
 * Properties: the way you identify the object e.g: characteristics
 * Behavior: indicates what is the use of that object
 * 
 * Pen as an Object: 
 * Properties: color, cap, size, length, weight, material, company, logo, type, Price  
 * Behavior: writing, drawing, scribbling
 * 
 * Bike as an Object:
 * Properties: model, campany, logo, engine, color, weight, height, mileage 
 * Behavior: drive, applyBreake, accelerate, Setgears
 * 
 *  Human:
 *  Properties: id, age, name, height, weight, color
 *  Behavior:walk, talk, think, act, eat, sleep
 *  
 *  Classes: 
 *  collection of similar object is a class
 *  
 *  Class: students
 *  Object: individual student will be the object
 *  
 *  Teachers:
 *  teachers object
 * 
 * 
 *Properties in java are defined as variables
 *behavior in java are defined as methods or functions
 * 
 *  
 * 
		 */
		 
		 
		 
		 
				 
				 
				 

	}

}
