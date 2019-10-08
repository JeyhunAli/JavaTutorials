package java_tutorials;

public class RemoveJunkfromString {

	public static void main(String[] args) {

		String s = "цвыцццццфф 2586 america land of turists";
		String s1 =" @#45878&&&*9 hello world ";
		
		
		
		s = s.replaceAll( "[^a-z A-Z 0-9]", ""); //regular expression replace all method is used to remove all unwanted char.
		System.out.println(s);
		
		
		s1 =s1.replaceAll("[^a-z A-Z 0-9]",""); //here u asking give me the value small letter a-z upper case A-Z and 0-9  ""->blank expression
		System.out.println(s1);
		
		
		
		
		    

	}

}
