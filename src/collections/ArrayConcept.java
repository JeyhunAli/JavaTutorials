package collections;

public class ArrayConcept {
	
	
	/**
	 *  Array means special variable which will hold similar type of the data 
	 *what i mean by similar for example if its integer number or 
	 *string or char it will be hold similar data type 
	 *
	 *Array out of bound exception is coming when we are trying to print the value which is we never declared 
	 *
	 *
	 *aince array is static and can holf only one data type 
	 *and similar of them 
	 *to solve this issue we use array object super class 
	 *array object class can hold different data types 
	 *object array is super class 
	 *if we really want to declare our data with the static array and want to use different data type at time 
	 *need to use object class 
	 */
	
	

	public static void main(String[] args) {


		int a [] = new int [10];
		a[0]=20;
		a[1]=30;
		a[2]=10;
		a[3]=60;
		a[4]=37;
		a[5]=67;
		a[6]=99;
		a[7]=90;
		a[8]=21;
		a[9]=99;
		a[1]=34;
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[1]+a[0]);
		System.out.println(a[4]);
		System.out.println(a[9]);
	//	System.out.println(a[10]);      ArrayIndexOutOfBoundsException
	//	System.out.println(a[-1]);      ArrayIndexOutOfBoundsException
		System.out.println(a.length);
		System.out.println("**************");
		
		for (int k=0;k<=a.length-1;k++) {
			System.out.print(a[k]);
		}
		
		
		
		
		
	}

}
