package stringConcept;

public class ReverseString {
	static String reverse="";
	public static void reverse(String str) {
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reverse=reverse+str.charAt(i);
			
			
		}System.out.println("reverse string is="+reverse);
		
	}
	public static void polindrome(String str) {
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reverse=reverse+str.charAt(i);
			
			
		}if(str.equals(reverse)) {
			System.out.println("String are polindrome");
		}else {
		System.out.println("string not polindrome ");
		}
	}

	public static void main(String[] args) {
		reverse("Sanjeev");
		polindrome("mawm");
		
		

	}

}
