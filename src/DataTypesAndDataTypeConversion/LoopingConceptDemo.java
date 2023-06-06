package DataTypesAndDataTypeConversion;

import java.io.UTFDataFormatException;
import java.util.Iterator;

public class LoopingConceptDemo {
	public static void main(String[] args) {
		
	//------------------------For Loop--------------------
/*For Loop: used to execute same code again and again 
 * 
 * 3 parameter
 * 1 . initialization
 * 2 . conditional check
 * 3 . increment/decrement operator
 * */	
	
	//print numbers from 1 to 10
	for (int i=1; i<=10; i++) {
		System.out.println(i);		
	}
	
	//print number from 10 to 1
	
	for (int i=10; i>=1; i--) {
		System.out.println(i);			
	}
	
	//print 1 to 10 numbers name
   // if i = 2 than instead of i print Usman
	
	for (int i = 1; i < 11; i++) {
		//System.out.println(i);
		
		//Difference between "=" and "==" (in Java) 
		//"=" is called the assignment single operator or isequal.
		//"==" or "double" is used to comparision/compare values.
		
		//----------------------------if/else-----------------------
		
		if ( i == 2 ) {
			System.out.println("Usman");	
		}
		else {
			System.out.println(i);
		}	
	}
		System.out.println("Learning if else");
		
		int j =2;
		if (j == 1) {
			System.out.println("Aleema");			
		}
		else {
			System.out.println("Usman");
			
			//Note: If "if statement" is true then if statement is printed
			// if "if statement" is false then else statement is printed
			
			//------------------------else if (when we have multiple conditions)----------------------------
		}
		
		//print 1 to 10 numbers name
	   // if i = 22 than instead of i print Kanwal
	   // if i = 27 than instead of i print Lalarukh	

		
		
		for (int i = 20; i < 30 ; i++) {
			if (i == 22) {
				System.out.println("Kanwal");				
			}
			
			else if (i == 27 ) {
				System.out.println("Lalarukh");
				
			} 
			else {
				System.out.println(i);	
			}
		}
		
		 //Print 1 to 10 numbers
		//if found 5 stop and also skip 5
			for (int i = 1; i < 11; i++) {
				if ( i == 5) {
		//Note**For exit operation we will use keyword "break"
					break;
				}
				System.out.println(i);
			}
			
		//print 1 to 10 numbers
	   //if i is 4 then skip 4	
			for (int i = 1; i < 11; i++) {
			
				// In if condition we are checking that if the i = 4 then 
				//it should skip 4 and continue further
				if ( i == 4 ) {
					continue;
				}
				System.out.println(i);
				
     	//Note** To skip 1 iteration we use "continue" keyword and 
		// to break the entire execution further we use "break" keyword  		
				
			}
			
			//------------------------While loop-----------------------------------------
			int k = 1;
			while (k == 1) {
				System.out.println("Usman");
				k++;
				
			//In for loop we know when to stop and in the while loop we don't know the condition of the stop
		    //while loop is mostly used in database operation
			//In while loop first we check the condition after that we will execute
			}
			
			//do while loop
		   //In do while loop first we will execute after that we will check the condition
		  //means if the condition is false after that it will not execute but on time it will definitely execute
          //At least one time will be executed
			
			int l = 1;
			do {
				System.out.println(l);
				l++;
			} while (l <= 10);
	      
			//switch Statement
			
			int day = 77;
			switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Firday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			case 8:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Enter the numbers between 1 to 7");
				break;
			}
	}
	}
	
	

