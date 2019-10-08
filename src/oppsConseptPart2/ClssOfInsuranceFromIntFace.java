package oppsConseptPart2;
//here we are implementing only two interfaces for now but for the future if new interfaces we can implement them too
//it means child class can implement multiple interafces 
public class ClssOfInsuranceFromIntFace implements USAInsuranceIntFace, BakuBrancofUSInsurance {

	
	//these  all the methods are coming from 2 interfaces  lets say for the fututr some of the interface they updated some new methods 
	//here in this class we will get error why because we have to update that methods in our class as well
	//these all the methods are coming from interfaces , but this class also can has its own methods as well but its noy related with interafces
	@Override
	public void healthInsurance() {
System.out.println("health insirance");		
	}

	@Override
	public void petInsurance() {
System.out.println("pet insurance");		
	}

	@Override
	public void employeeInsurance() {
System.out.println("employeeinsurance ");		
	}

	@Override
	public void carInsurance() {
System.out.println("car insurance");		
	}

	@Override
	public void homeInsurance() {
System.out.println("home insurance");		
	}

	@Override
	public void businessInsurance() {
System.out.println("businessinsurance");		
	}

	@Override
	public void tradingInsurance() {

System.out.println("trading insurance");		
	}
	
	public void mutualprotectingInsurance() {
		System.out.println("mutualprotectingInsurance");
		
	}
public void bankInsurance() {
	System.out.println("bankInsurance");
}
	
	
	
}
