package oopsconcept3;

public class Testingthispackageabstarct extends Shapeabstrct {

	public static void main(String[] args) {
       
		Shapeabstrct obj = new Testingthispackageabstarct();
		obj.takingPhoto();
		obj.sendingPhotos();

	}

	@Override
	void takingPhoto() {
		System.out.println("taking my best pfoto ");		
	}

}
