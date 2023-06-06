package HandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {
	public static void main(String[] args) throws FileNotFoundException {
	/*
	 * Now lets say that i write some line, we learn file handling
	 * i want to read a file, to read a file there is a class called "filereader"
	 * Filereader read = new Filereader("filename"); 
	 * see now java is giving you an error, ideally there is no error overhere (in the above line of code)
	 * i am simply saying that to "reader" read the file which is present at this location 
	 * but java is taking extra care over here what is this file?
	 * let say i write "(C:/usman/filename.doc)" (whatever file you have written)
	 * is not present at this location then what to do?
	 * as i said java can not take run time decision so it is asking you what to do?
	 * if the file is not present, over here one simple question is asking is now this error
	 * did you have to run your code to see this exception "no" when you write the code and when it is saved 
	 * java is prompting you that thier can be an exception you can give any path it will not work. The file 
	 * is not present then what to do?
	 * This type of exception is called as "compile time" exception 
	 * so we need to handle the exception
	 * we use try-catch-final block
	 * 
	 * */
		FileReader reader = null;
		
		try {
			 reader = new FileReader("C:/remonteServerIP/Usman/filename.doc");
		} catch (Exception e) {
			// read file from local machine
			//reader =	new FileReader("C:/localServer/filename.doc");
			// if give wrong file path
			System.out.println("please give correct file name and folder");
		}
	    finally {
		   //close the connection		
	}
		System.out.println("Usman");
		try {
			System.out.println(50/0);
		} catch (Exception e) {
			System.out.println("Division by zero is not allowed");
		}
		
		System.out.println("JAVA");
		
		/* ---- Examples of run-time exceptions
		 * 
		 * 	int [] a;
		a = new int[3];
		a[1] =	1;
		a[2]=	2;
		a[3]=	3;
		System.out.println(a[12]);
		
		
		String name = null;
		System.out.println(name.length());
		 * 
		 * */
		
	
		
		
	}

}
