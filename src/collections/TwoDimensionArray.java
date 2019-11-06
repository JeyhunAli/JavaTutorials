package collections;

public class TwoDimensionArray {

	public static void main(String[] args) {
		//Two dimensial array this all about rows and columns 
		//for that we use 2 square bracket one for row another for column 
		//like excel sheet 

		String x [][]=new String[3][5];    //3 is rows ,5 is columns 
		System.out.println(x.length);     //for printing total num of row we use .length method 
		System.out.println(x [0].length);  //for printing  total num of the columns we use [0].length method 


		x[0][0]="A";  //1st row 
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";


		x[1][0]="A1";  //2nd row 
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";		

		x[2][0]="A2";  //3rd row 
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";

		System.out.println(x[1][3]);
		System.out.println(x[0][4]);
		//System.out.println(x[5][1]);   java.lang.ArrayIndexOutOfBoundsException  out of bound because not existing 
		System.out.println(x[2][2]);

		//printing all the values of 2dimension array  we use for loop 
		// two time for loop we use one for row and one for column.

		for (int row=0;row<x.length;row++) {          //for row 
			for(int col=0;col<x[0].length;col++){      //for column 
				System.out.println(x[row][col]);

			}
		}	









	}

}
