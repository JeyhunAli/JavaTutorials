package java_tutorials;

public class StaticArrayInJava {

	public static void main(String[] args) {
		//the purpose of the array is to store similar data value in a array variable 
		//what i mean by similar data for example int all int number,double-all double number ,char-all char.
		//lowest bound of array index is 0
		//upper bound of array index is n-1(n is size of array)
		int i[]=new int[10]; //initialazing array 
		i[0]=10;
		i[1]=15;
		i[2]=20;
		i[3]=25;
		i[4]=30;
		i[5]=35;
		i[6]=200;
		i[7]=365;
		i[8]=333;
		i[9]=740;

        System.out.println(i[2]);
		System.out.println(i[4]);
		System.out.println("*********************");
		//advantages of the array we can store multiple value in one variable 
		//all these one dimension array  (one sized array)
		//if we would like to print i[10] its gonna give us this following error because it starts from zero and  ends in 4 but 
		// we trying print 5
		//System.out.println(i[10]);    java.lang.ArrayIndexOutOfBoundsException: 

		//if we would like to print all the values of array for that we use for loop 

		for(int a=0;a<i.length;a++) {   //.length method alredy built in java it provide us with the size of array value 
			System.out.println(i[a]);
			System.out.println(i.length);    //if we would like to print the actual size of array we use length method
		}    
		//disadvantages static array 1.size is fixed-static array,2.stores similar data type 
		//disadvantages of one dimension array lets say if we  want to store different data type for ex int,char,
		//string all in one array we cant in here 
		//size is fixed it means if declare array for 10 or 20 value and in the future something changed and we have to increase the value 
		//for that one dimension ,static array is not handy  
		//.size fixed array static array -- to overcome this problem we use collections-Arraylist,Hashtable -- dynamic array
		//2.similiar data type-to overcome this issue we use Object array -Object is class 
		double d[]=new double[3];
		d[0]=0.1;
		d[1]=3.5;
		d[2]=5.5;
		for(int b=0;b<d.length;b++)
			System.out.println(d[b]);  
		System.out.println(d.length);
		System.out.println(d[1]);


		String s[]=new String[4];
		s[0]="Hello";
		s[1]="America";
		s[2]="newyork";
		s[3]="Brooklyn";

		System.out.println(s.length);

		//Object array is class in java its used to store different data type values.
		Object ob []=new Object [6];   //initialazing of the object class in java 
		ob[0]="Tom";
		ob[1]=26;
		ob[2]=6.1;
		ob[3]="02/01/1988";
		ob[4]='M';
		ob[5]="London";
		System.out.println(ob.length);
		System.out.println(ob[5]);
		for(int w=0;w<ob.length;w++) {   //this for loop  method use to print all the values on the console 
			System.out.println(ob[w]);
		}






	}

}
