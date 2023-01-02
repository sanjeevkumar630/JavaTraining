package stringConcept;

public class SpiltString {

	public static void stringSpilt(String str) {

		String strArray[] = str.split("-");

		 for (String string : strArray) {
			 System.out.println(string); }
		 

		/*
		 * for (int i = 0; i < strArray.length; i++) {
		 * 
		 * System.out.println(strArray[i]);
		 * 
		 * }
		 */

	}

	public static void main(String[] args) {

		stringSpilt("hi-this-is-sanjeev");
	}

}
