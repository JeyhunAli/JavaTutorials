package java_tutorials;

public class IfElse_2 {

	public static void main(String[] args) {

		int a=20;
		int b=30;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else{
			System.out.println("b is greater than a");
		}
		
		
		String browser = "chrome";
		String browser1 = "safari";
		String browser2 = "FireFox";
		if(browser.equals("chrome")) {
			System.out.println("launch the browser with chrome");
		}
		else if (browser.equals("firefox")) {
			System.out.println("launch the browser with ff");
		}
		else if (browser.equals("safari")) {
			System.out.println("launch the browser with safari");

		}

		/**
		 * dead code it means the code will never go to the next line 
		 * if part checking only else 
		 * it depends it can be true also  mause over the yellow line 
		 */
		if (false) {
			System.out.println("passsss"); 
		}
		else{
			System.out.println("failllll....");

			
		}
		
	}

}
