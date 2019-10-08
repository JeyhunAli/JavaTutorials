package java_tutorials;

public class FindingMissingNumInArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,9,};
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum = sum+a[i];
			
		}
		System.out.println(sum);
		
		int sum1 = 0;
		
		for(int w=1;w<=9;w++) {
			sum1=sum1+w;
			
		}
		
			System.out.println(sum1);	
		System.out.println("missing number is: "+ (sum1-sum));
		
		}

}
