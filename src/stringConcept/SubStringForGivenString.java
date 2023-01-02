package stringConcept;

public class SubStringForGivenString {

	//public static void main(String[] args) {
	public static void subString (String str) {
		//String str="sanjeev";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				
				System.out.println(str.substring(i, j));
				
				
				
			}
		}

	}public static void main(String[] args) {
		subString("sanjeev");
	}
	
	}


