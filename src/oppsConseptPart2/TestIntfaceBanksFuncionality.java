package oppsConseptPart2;
//here while testing and implementation of interface and turkey bank class 
// we cannot create object of interface its not allowed instantiate . instead we can create turkey bank object 
public class TestIntfaceBanksFuncionality {

	public static void main(String[] args) {

		TurkeyBankIntFace tb = new TurkeyBankIntFace();
		tb.debit();
		tb.credit();
		tb.transferMoney();     //here we can access all the methods of interface and turkey bank class methods 
		tb.educationLoan();   
		tb.carloan();
		
		
		//in interface in a single class we can inherit from multiple interface by implements keyword after that we have to override their methods 
		// but in inheritence we can inherit only from one parent class by extends keyword 
	
		
		
		//here we can achieve dynamic polymorphism 
		//child class object can be reffered by parent interface variable 
		UsBankIntFace InterfaceBank = new TurkeyBankIntFace(); 
		InterfaceBank.credit();
		InterfaceBank.debit();
		InterfaceBank.transferMoney();//here we can call only overriden methods not child class methods 
		//if any particilar class is iplementing any interface its mandatory to override all the methods of interface 
		//and that clas can have their own methods 
		
		System.out.println("min balance has to be $" + UsBankIntFace.min_balance);	 //here accesing data type by interface name 
		//interface data value here is 100 we cannot change it if want to its gonna give us error 
		
		
		tb.mutualfunds();       // here no need to create anothoer object of child class 
		tb.helpSociety();
		tb.keepYourMoneySafe();
		
		ShapeAbs objn = new TurkeyBankIntFace();
		objn.smile();
		
	}

}