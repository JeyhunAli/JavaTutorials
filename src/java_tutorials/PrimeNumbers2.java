package java_tutorials;

public class PrimeNumbers2 {

	public static void main(String[] args) {

	for(int i =2;i<=10;i++) {
		boolean love = true;
		for(int y=2;y<=i-1;y++) {
			if(i%y==0) {
				love=false;
				break;
			}
		}
		if(love==true) {
			System.out.println(i);
		}
	}
		
		
		
		


	

	}
	
	
	
	
}

