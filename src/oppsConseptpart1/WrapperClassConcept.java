package oppsConseptpart1;         //Wrapper classes in java is all about Data conversion
// from string to different data type and from different data type to string .
//from string to different data type conversion we use parseint method 
// from different  data type to string we use valueOf method 
//its very important lets say we are testing some numbers and they are available in some webpages in form of string for converting them 
// we have to use these methods 
public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100"; //this is a string variable and it will treat as a string not like number 
		System.out.println(x+20);//console will be 10020 why its couse this is string congatinations like sentence  
		
		
		//this is call wrapper class in java. if want to convert string into to int we use parseint class 
		
		int i = Integer.parseInt(x);//data conversion: converting string to integer 
		System.out.println(i+20);
		 
		String y = "15.55";// data conversion: from string to double 
		System.out.println(y+12.3);
		double d= Double.parseDouble(y);//here if we run the program without storing data type to double d 
		                                 //it will run as string congationation.its  not gonna convert 
		System.out.println(d+12.3);
		System.out.println("tayfun got");
		
	//in java there s no available parse method for character data type .to convert it from string to char
		
		String b = "true";
		System.out.println(b);
		boolean b1=Boolean.parseBoolean(b);
		System.out.println("my estimation is: "+b1);
		
		//in java lets say we want to convert from int to string for that we have available method in java its call .value method 
		
		int k = 450;
		System.out.println(k+50); //console will be 500 if want to see on the console like string congationation 45050 we use value method 
		String s = String.valueOf(k);//storing String. without storing we wont get the result as string congationation we will get as sum
		System.out.println(s+50);//converting int to string 
		
		//interview question
		String u = "100A";
		System.out.println(20+u);
		int u1 = Integer.parseInt(u);// cannot convert this data type because here integer is not pure 
		System.out.println(u1+20);//here we will get error why because 100A is not pure integer value 
		// we will get number format exception error 
		
				
		
		
		
	}

}
