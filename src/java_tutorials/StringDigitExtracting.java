package java_tutorials;

public class StringDigitExtracting {

	public static void main(String[] args) {

		
		String s1 = "this is your order number 123456";
		System.out.println(s1.replaceAll("[^0-9]", ""));   // this is the method to extract digits from given string 
		
		String s2 = "page not found page 404 error  ";
		System.out.println(s2.replaceAll("[^0-9]", ""));
		
		
	}

}
