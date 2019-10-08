package oppsConseptPart2;

public interface BakuBrancofUSInsurance {
	
	//in interface we can declare data type and they are by default static , so no need to write static keyword when we declare data type
	
	public void healthInsurance();     //no method body in interface only method declaration protatype
	                                  //cannot create object of interface , interface cannot be instantiate
	public void petInsurance();         //in interface we can define the variables and the given variables in interface are not allowed to change 
	                                   //when we accesing the interface  variables the given value of variables are not allowed to change 
	public void employeeInsurance();   //in interface no static method allowed. why because interface is part of OOP concept 
	
	
}  // these methods here without body just declaration these cals ABSTARCT METHODS  
