package java_tutorials;

public class StringConcatinations {

	public static void main(String[] args) {
        //String concationation +sign is concationation operator 
		int a =200;
		int b =300;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 13.66;
		
		
		System.out.println(a+b);
		System.out.println(x + y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y); //this is left to right executing because of that first 500 after that just adding like sentences
		System.out.println(c+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d+a+b);//here adding nubs just like sentences 
		System.out.println("Addition of a+b is equal to: " + (a+b));
		
		System.out.print("hello Amerika "); //witout ln just priniting on console 
		System.out.println("Hello New York ");// with ln new line: printing on new line console 
	}

}
