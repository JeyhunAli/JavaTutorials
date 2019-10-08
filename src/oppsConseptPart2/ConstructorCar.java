package oppsConseptPart2;

public class ConstructorCar {
	
	
	String name ;
	int year ;
	int price;
	String engine;    ////here we are creating just prototype just blueprint designing
	
	public ConstructorCar (String name, int year, int price, String engine) {
		this.name = name;
		this.year = year;  //here we are creating just prototype just blueprint designing
		this.price = price;//lets say its real project for the future we can and more design more features 
		this.engine = engine;
		
	}
	
	public ConstructorCar(String name, int price,String engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}

	public static void main(String[] args) {
		ConstructorCar obj = new ConstructorCar("BMW", 2019, 30, "Automatic");//here we are passing all the different parametrs 
		ConstructorCar obj1 = new ConstructorCar("ford", 2020, 50, "Automatic v6");//here for each and every created object java creating space in memory
		ConstructorCar obj3 = new ConstructorCar("Mustang", 2019, 60, "Automatic");
		ConstructorCar obj4 = new ConstructorCar("Toyoto", 45 ,"Automatic");
		
		
		System.out.println(obj.name+ " " + obj.price +" "+ obj.year+ " " + obj.engine);
		System.out.println(obj4.name +" " + obj4.price +" " + obj4.engine);
	
		}
		
		
		
	}


