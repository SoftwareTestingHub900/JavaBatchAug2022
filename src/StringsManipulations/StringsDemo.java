package StringsManipulations;

public class StringsDemo {
	public static void main(String[] args) {
		String name = "Usman";
		System.out.println(name);
		System.out.println(name.length());
		//updating name
		name = name.concat("Imtiaz");
		System.out.println(name);
		
		String Depart = "IT";
		System.out.println(Depart);
		
		String S1 = new String("Hello");
		S1 = S1.concat("Word");
		System.out.println(S1);
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append("to my session");
		System.out.println(sb);
		
		//HW print reverse without using inbuilt method
		//verify if the given sprint is a palindrome or no
	   //madam - Yes, ajay, abc- no
		String sample = "I am Usman";
		StringBuffer sb1 = new StringBuffer(sample); 
		String stringreversed = sb1.reverse().toString();
		System.out.println(stringreversed);
		
		System.out.println(sb.charAt(2));
		System.out.println(sb.deleteCharAt(0));
		
		String S11 = "Usman";
		String S12 = "Usman";
		System.out.println(S11 == S12);//yes
		System.out.println(S11.equals(S12));//yes
		
		String S13 = new String("abc");
		String S14 = new String("abc");
		System.out.println(S13 == S14);
		System.out.println(S13.equals(S14));
		
		String S15 = "XYZ";
		String S16 = new String("XYZ");
		System.out.println(S15 == S16);
		System.out.println(S15.equals(S16));
		
			
	
		
	
		
		
	}

}
