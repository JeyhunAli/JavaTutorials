package java_tutorials;

public class LoopsConsept {

	public static void main(String[] args) {
		// looping consepts allows us to execute a statement or group of statement multiple time 
            //looping mean if you want coding  same similar code and print them 
		//1. While loop
		int i= 9;     //initialazation 
		while(i<100) {    //conditional part 
			System.out.println(i);  //printing 
			//i=i+3;
			//i=i+2
			i++;  //incrementation 
			//disadvantage of the while loop if you dont provide this statement with the incermental or decremental part it will 
			     //infinite loop on the console the given number 
		}
		System.out.println("***********");
		
		
		for(int k=10;k<=41;k++) { //initialazation, conditional,incrementation all in one row 
			System.out.println(k);
			
		}
		System.out.println("***********");
		//10to 1 decremental 
		for (int a=10;a>=0;a--) {
			System.out.println(a);
		}
		System.out.println("**************");
		
		for(int b=10;b>=-10;b--) {
			System.out.println(b);
		}
	}

}
