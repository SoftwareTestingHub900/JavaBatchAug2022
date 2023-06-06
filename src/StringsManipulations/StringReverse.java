package StringsManipulations;

import java.util.Iterator;

public class StringReverse {
	/*
	 * Giver a String, print a character at index 4 
	 * IP: Welcome 
	 * OP: c
	 */

	public static void main(String[] args) {
		String str = "Welcome";
		int index = 4;
		getcharbyindex(str, index);
		ReverseString(str);

	}
	
	public static void getcharbyindex(String str, int index) {
		System.out.println(str.charAt(index));
//		StringBuffer string = new StringBuffer(str);
//		String stringreversed = string.reverse().toString();
//		System.out.println(stringreversed);
		
	}
	
	//print it in reverse
	
	public static void ReverseString(String str) {
		System.out.println(str.length());
		int len =str.length();
		for (int i = len-1 ; i >=0 ; i--) {
			System.out.print(str.charAt(i));
			
		}
		
	}
	
	

}
