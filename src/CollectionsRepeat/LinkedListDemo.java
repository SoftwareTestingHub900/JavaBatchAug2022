package CollectionsRepeat;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(11);
		list.add(11);
		System.out.println(list);
		
		list.addFirst(101);
		System.out.println(list);
		list.addLast(201);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		
	}

}
