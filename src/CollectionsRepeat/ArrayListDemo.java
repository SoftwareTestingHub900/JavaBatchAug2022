package CollectionsRepeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
/* adding, editing, updating and accessing
 * 
 * */		
		list.add(10);
		list.add(21);
		list.add(05);
		System.out.println(list);
		list.add(232);
		System.out.println(list);
		list.add(05);
		System.out.println(list);
		
		//fetch the values
		//getter and setter
		System.out.println(list.get(2));
		list.set(0, 90);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(1, 100);
		System.out.println(list);
		System.out.println("Size of the list is "+ list.size());
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.contains(5999));
		
		for (int i = 0; i < list.size(); i++) {
			Integer a = list.get(i);
			if ( a == 2188) {
				System.out.println("true");
				
			}			
		}
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(500);
		list1.add(502);
		list1.add(503);
		System.out.println(list1);
		
		list.addAll(1, list1);
		System.out.println(list);
		
	//	list.removeAll(list1);
	//	System.out.println(list);
	
		Collections.sort(list);
		System.out.println(list);
		
		
		
		//find the max and mini in the list
		//find avg in the list
		//remove the duplicates in the list
		//IP = {2, 4, 2, 6,9,6} OP = {2,4,6,9}
		
	}

}
