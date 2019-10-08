package oppsConseptPart2;

public class TestInsuranceIntDFace {

	public static void main(String[] args) {

		ClssOfInsuranceFromIntFace obj = new ClssOfInsuranceFromIntFace();
		
		obj.carInsurance();
		obj.businessInsurance();
		obj.homeInsurance();
		obj.tradingInsurance();
		
		obj.healthInsurance();
		obj.petInsurance();
		obj.employeeInsurance();
		
		
		obj.mutualprotectingInsurance();
		obj.bankInsurance();
		
		System.out.println(USAInsuranceIntFace.min_balanceInsurance);
		System.out.println(USAInsuranceIntFace.max_balanceInsurance);//here variables are calling by interface name 
		System.out.println(USAInsuranceIntFace.min_balanceInsurance + USAInsuranceIntFace.max_balanceInsurance);
		
		
		USAInsuranceIntFace obj1 = new ClssOfInsuranceFromIntFace(); //here we cannot create object of a interface but by using interface name we can 
		                                                             //create refference of interface which is reffering to child class
		obj.carInsurance();                                        //note once we are using interface reffering name to create child class in that
		obj1.businessInsurance();                                 //case we cannot access to other interfases or another class methods 
		obj1.homeInsurance();
		obj1.tradingInsurance();
		
		//interface calls 100% abstarction it means all the implementation is writing in the child class 
		//in interface we are just declaring a prototype
		//and what is the ABSTARCT CLASS abstarct class also calls abstarction 
		//in abstarct class we can achieve partial abstarction
		//but in interface we are achieving 100% abstarction
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


