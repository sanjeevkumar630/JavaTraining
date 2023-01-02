package stringConcept;

public class SumOfStrings {
	
	public static void sumStrings(String str1, String str2) {
		int s3=Integer.parseInt(str1)+Integer.parseInt(str2);
		System.out.println(s3);
		System.out.println(String.valueOf(s3));
	}

	public static void main(String[] args) {
		sumStrings("123", "143");
		

	}

}
