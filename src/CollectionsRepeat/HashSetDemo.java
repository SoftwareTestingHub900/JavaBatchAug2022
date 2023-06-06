package CollectionsRepeat;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		System.out.println(set);
		set.add(79);
		System.out.println(set);
		set.add(34);
		set.add(34);
		System.out.println(set);
	}

}
