package java_tutorials;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Aliyev Jeyhun";
		String str1= "hello Azerbaijan";
		String str2 = "learning java";
		String str3="internetexplorer";
		

		int len = str.length(); String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);            //1st way with for loop because string is immutable
		} System.out.println(rev);

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());           //2nd way because stringbuffer is mutable
		{

			StringBuffer sb1 = new StringBuffer(str1);
			System.out.println(sb1.reverse());

		}
		StringBuffer sb2 = new  StringBuffer(str2);
		System.out.println(sb2.reverse());


		StringBuffer sb3 = new StringBuffer(str3);
		System.out.println(sb3.reverse());



	}

}