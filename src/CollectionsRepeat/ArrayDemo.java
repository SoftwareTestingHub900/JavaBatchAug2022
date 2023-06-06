package CollectionsRepeat;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] ids; // declaration
		ids = new int[5]; // instantiation
		ids[1] = 10;
		ids[2] = 1076;
		ids[3] = 342;
		ids[4] = 14;
		// accessing elements direct by index

		System.out.println(ids[0]);
		System.out.println(ids[1]);
		System.out.println(ids[2]);
		System.out.println(ids[3]);

		// accessing all the elements

		System.out.println("Using for loop");
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
			Arrays.sort(ids);
			

		}

		System.out.println("Learning Looping");
		int[] numbers;
		numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			// assign value of i to numbers
			numbers[i] = 10 * (i + 1);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}

		System.out.println("Adding the values in the array");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println(sum);

		char[] C1;
		C1 = new char[5];
		C1 [0] = 80;
		C1 [1] = 20;
		C1 [2] = 11;
		C1 [3] = 21;
		
		
	}

}
