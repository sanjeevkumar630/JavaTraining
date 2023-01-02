package stringConcept;

public class NumberOfWordsInString {
	
	public static int numberOfWords(String str) {
		int count=0;
		
		if(str.charAt(0)!=' ') {
			count++;
			
		}
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				
				count++;
				//System.out.println("noumber words in given string is=" +count);
				
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {

		int countValue=numberOfWords("hi this is sanjeev kumar");
		System.out.println("number of words in given string is=" +countValue);
	}

}
