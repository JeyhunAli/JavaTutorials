package java_tutorials;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateinString {

	public static void main(String[] args) {
		String str = "saiprasad";
		System.out.println("Before duplicate value is:"+str);
		char a[]=str.toCharArray();
		
		Set<Character> s=new LinkedHashSet<Character>();
		
		for(char b:a) {
			s.add(b);
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(Character b:s) {
			sb.append(b);
		}
		
		System.out.println("After removing duplicat value is "+sb.toString());

		
		

	
	}

}
