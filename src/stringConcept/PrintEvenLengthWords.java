package stringConcept;

public class PrintEvenLengthWords {

	public static void evenWord(String str) {

		for (String s : str.split(" ")) {
			if (s.length() % 2 == 0) {
				System.out.println(s);
			}
		}

	}

	public static void main(String[] args) {

		evenWord("hai this is sanjeev");
		evenWord("hell sanje hai swet");

	}

}
