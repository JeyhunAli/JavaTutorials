package java_tutorials;

public class StringDef {

	public static void main(String[] args) {
		
	String strn = "This is the night when im studying";
	String str = "late night studying";
	System.out.println(str);
		 
		System.out.println(strn.contains("f")); 
		System.out.println(strn.charAt(3));
		System.out.println(strn.charAt(15));
		
		char[] charArray1=str.toCharArray();
		for(int i=0; i<charArray1.length; i++) {
			System.out.println("index "+i +"is: " + charArray1[i]);
		}
		 
		char[] charArray = strn.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			
		System.out.println("index " + i +"is: " +charArray[i]);
		
		
		}		
		System.out.println("lower case is: " +strn.toLowerCase());
		System.out.println("upper case is: "+ strn.toUpperCase());

	}


}