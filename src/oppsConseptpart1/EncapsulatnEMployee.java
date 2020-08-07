package oppsConseptpart1;
// encapsulation is one of the oops consept 
//there 3 oops consepts they are called PIE factor 
//polymorphism, inheritence, encapsulation.
public class EncapsulatnEMployee {
	//1. how to implement encapsualation: 1st we declare instance variable as a private so no one from outside the class can 
	// access it directluy 
	//encapsulation is data members hiding it can be some varieables or some methods 
	//for that we use private keyword so from outside of the cllass noone can access
	//once we declare our method or our variables as private noone can access them directly 
	// if someone need to access them for that need to use getters and setters method 
	
	//purpose of encapsulation data hiding
	//one of the oops consepts
	private int ssn;
	private String name;
	private int age;           // fields 
	private String adress;
	
	/**
	 * Encapsulation means to encapsulate two thing together 
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		EncapsulatnEMployee emp = new EncapsulatnEMployee();
		emp.setSsn(123456);
		emp.setName("peter");
        emp.setAge(28);	
        emp.setAdress("brooklyn 18 ave");
        
       System.out.println("employee ssn is "+ emp.getSsn());
       System.out.println("employee name is "+ emp.getName());
       System.out.println("employee age is "+ emp.getAge());
       System.out.println("employee adress is "+ emp.getAdress());
		
		
			}

//2nd right click from source we seting setters and getters methods to set and get the fields 
	//getters and setters method have to be declare as a public so then external user can access it 
	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}

}
