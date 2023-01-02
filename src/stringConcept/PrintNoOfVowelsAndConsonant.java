package stringConcept;

public class PrintNoOfVowelsAndConsonant {

	public static void countVowels(String str) {

		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (isVowel(str.charAt(i))) {

				++vowelCount;

			} else {
				++consonantCount;
			}

		}
		System.out.println("Vowel Count is " + vowelCount);
		System.out.println("consonant count is " + consonantCount);

	}

	public static boolean isVowel(char ch) {

		ch = Character.toUpperCase(ch);

		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}

	public static void main(String[] args) {
		// String str="sanjeev";
		countVowels("sanjeev");

	}

}
