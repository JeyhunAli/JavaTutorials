package java_tutorials;

public class ArmstrongNumber {

	/**
	 * Armstrong number is lets say 153 is given number the cube of every number 1,3,5 and sum of them is armstrong number 
	 */
	 
public static void isArmstrongNumber(int num) {
	
	System.out.println("given number is " +num);
	
	int cube = 0;
	int r;
	int t;
	
	t=num;
	
	while(num>0) {
		r=num%10;
		num=num/10;
		cube=cube+ (r*r*r);
		
	}
	if (t==cube) {
		System.out.println("its an armstrong number");
	}
	else {
		System.out.println("its not an armstrong number");
	}
	
}
	
	
	
	public static void main(String[] args) {
		
		isArmstrongNumber(258);
		isArmstrongNumber(257);
		isArmstrongNumber(256);

		
		
	}

}
