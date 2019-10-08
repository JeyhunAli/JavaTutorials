package oppsConseptpart1;

public class Car {

	int mod;         //class variables
	int wheel;
	public static void main(String[] args) {
		/*
		 * Object − Objects have states and behaviors. Example: A dog has states -
		 * color, name, breed as well as behaviors – wagging the tail, barking, eating.
		 * An object is an instance of a class.
		 * 
		 * Class − A class can be defined as a template/blueprint that describes the
		 * behavior/state that the object of its type support.
		 */
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		//new car(); this is the object of car class 
		//new keyword is used to create new object
		/// a,b,c  object reference varible 
		a.mod=2018;
		a.wheel=4;

		b.mod=2017;
		b.wheel=4;

		c.mod=2019;
		c.wheel=4;

		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);



	}

}
