package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	/*For any object creation majorly we perform 3 actions
	 * addition , editing/updating, deleting and accessing
	 * */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(05);
		System.out.println(list);
		list.add(231);
		System.out.println(list);
		list.add(05);
		System.out.println(list);
		
		//Fetch the value
		//Getter and Setter
		
		//access
		System.out.println(list.get(2));
		
		//update
		list.set(02, 100);
		System.out.println(list);
		
		//removal
		list.remove(1);
		System.out.println(list);
		
		//add
		list.add(1, 1000);
		System.out.println(list);
		
		System.out.println("Size of the list is " + list.size() );
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.contains(05));
		
		/*
		 * give a list, and a value
		 * tell me if the value is present in the list
		 * */
		
		for (int i = 0; i < list.size(); i++) {
			 Integer a = list.get(i);
			 if (a == 21) {
				 System.out.println("true");
				
			}
			
			
		}
		
		
		
	
	}

}
