package CollectionsRepeat;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HasgMAp {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Usman");
		map.put(3, "Adnan");
		map.put(2, "Ahamd");
		map.put(4, "Imtiaz");
		System.out.println(map);
		
		map.put(5, "Usman");
		System.out.println(map);
		map.put(6, null);
		map.put(7, null);
		System.out.println(map);
		map.put(2, "Salman");
		System.out.println(map);
		map.put(null, "Asfan");
		System.out.println(map);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Asfan"));
		
		System.out.println(map.get(2));
		System.out.println(map.get(100));
		
		//get all the keys in your map
		System.out.println(map.keySet());
		//to store in "Set" class
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		map.remove(2);
		System.out.println(map);
		
		//if the key is already present, do nothing else insert
		//first get all the keys, check if the keys is present than decide 
		map.putIfAbsent(4, "Orange");
		System.out.println(map);
		
		//how to print each key and value?
		//entry Set = {null=Asfan, 1=Usman, 3=Adnan, 4=Imtiaz, 5=Usman, 6=null, 7=null}
		//entry temp = 1=Usman
		
		for (Entry<Integer, String> temp : map.entrySet()) {
			System.out.println("Key is " + temp.getKey() + " Value is " + temp.getValue());
			
		}
		
		String name = "mobile 20000";
		String[] values = name.split(" ");
		for (String string : values) {
			System.out.println(string);
			//map.put (key[mobile], value[20000])  
			
		}
		
		
		
		
		
		

	}

}
