package Collections;

import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] ids; // declaration
		ids = new int [5]; //Instantiation
		
		/*[0,0,0,0,0]
		 * 0,1,2,3,4--------Index
		 * Size>>>>5
		 * 
		 * Maximum Index 5 Minimum Index 0
		 * */
		
		//Initialization
		//object variable [index] = value
		ids [1] = 10;
		ids [2] = 14;
		ids [3] = 342;
		ids [4] = 1076;
		
		//accessing elements directly by index
		System.out.println(ids[1]);
		System.out.println(ids[2]);
//		System.out.println(ids[3]);
//		System.out.println(ids[4]);
		
		//accessing all the elements
		System.out.println("Using for Loop");
		for(int i=0; i < ids.length ; i++) {
			System.out.println(ids[i]);
		}
		
		//Create an array as number of length 5 and assign value as 
		//10 , 20, 30, 40, 50
		//don't assign value one by one---> use for loop
		
		int [] number = new int [5];
		// [0,0,0,0,0]
		//  0,1,2,3,4----index  = i
		System.out.println("Learning Logic");
		for (int i = 0; i < number.length; i++) {
			number [i] = 10*(i+1);
		}
		
		for (int i = 0; i < number.length; i++) { 
			System.out.println(number[i]);
			
		}
		
		//Declaration and Instantiation together
		int [] a = new int [5];
		
		//Declaration and Instantiation and initialization
		int [] b = new int [] {20,30,40};
		
		int [] c = {3,7,89};
		System.out.println(b.length);
		System.out.println(c.length);
		
		//find the sum of all the elements in the array
		//find the max element in an array
		//find the mini element in an array
		//Practice for other data type
		int sum =0;
		for (int i = 0; i < number.length; i++) {
		sum	= sum + number [i];
		}
		System.out.println(sum);
		
		
		char [] C22 = new char [5];
		
		

}
	}
