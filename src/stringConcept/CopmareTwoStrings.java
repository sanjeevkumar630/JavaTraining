package stringConcept;

public class CopmareTwoStrings {
	
	public static void compareStrings(String str1, String str2) {
		boolean flag=false;
		for(int i=0; i<str1.length();i++) {
			
			if(str1.charAt(i)!=str2.charAt(i)) {
				 System.out.println("both the string are not equal");
				flag=false;
				break;
			}
			flag=true;
			
		}System.out.println("both strings are equal "+flag);
		
		
	}
	public static void compareStringsTwo(String str1, String str2) {
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("strings are equal");
			
		}else {
		System.out.println("not Equal");
	}}

	public static void main(String[] args) {

		compareStrings("Sanjeev", "Sanjeev");
		compareStringsTwo("Raj", "raj");

	}

}
