package oppsConseptPart2;


public class TestingAbstractting extends ShapeAbs{
	
	

	public static void main(String[] args) {
		ShapeAbs obj = new TestingAbstractting();  
		obj.smile(); 

	}

	@Override
	void smile() {
System.out.println("smiling is the gift ");		
	}

}
