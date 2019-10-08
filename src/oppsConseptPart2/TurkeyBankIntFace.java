package oppsConseptPart2;

public class TurkeyBankIntFace extends ShapeAbs implements UsBankIntFace,GermanBankIntFace { //once we implement usbankinterface still here we will get error message why because 
	//usbank has own methods we have to override them in turkeybank in order to follow the us bank rules  

	
	//one more important concept here our class inheriting extending one class and multiple interfaces. the combination of single class and multiple 
	//interfaces are allowed. but multiple parent classes are not allowed 
	//class can access multiple parent classess but it cannot extends multiple parent classess
	
	
	//top three method overriden from Usbank interface 
	public void debit(){
		System.out.println("Turkey---BAnk debit...");
	}

	public void credit() {
		System.out.println("Turkey---BAnk credit...");
	}
	public void transferMoney() {
		System.out.println("Turkey---BAnk transfering money...");
		
		
	}
	//two  method is Turkeybank class method 
	public void educationLoan() {
		System.out.println("Turkey---BAnk education loan ");
	}
	public void carloan() {
		System.out.println("Turkey---BAnk car loan "); 
	}
    
	
	//three method overriden from GermanBankintface interface  
	public void mutualfunds() {
		System.out.println("mutualfunds relationship");
	}
    public void helpSociety() {
    	System.out.println("helpSociety bank");
    }
    public void keepYourMoneySafe() {
    	System.out.println("keepYourMoneySafe in our Germany )))");
    }

	@Override
	void smile() {
System.out.println("your smiling kills me ");		
	}
} 
