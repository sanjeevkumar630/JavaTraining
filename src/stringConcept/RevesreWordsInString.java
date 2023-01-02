package stringConcept;

public class RevesreWordsInString {
	
	public static void reverseWord(String str) {
		
		String spiltArray[]=str.split(" ");
		
		for(int i=spiltArray.length-1;i>=0;i--) {
			
			System.out.println(spiltArray[i]);
			
		}
		
	}

	public static void main(String[] args) {
		reverseWord("Hai This is Sanjeev Kumar");


	}

}
