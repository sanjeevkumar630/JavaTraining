package Program;

public class NumberOfDigits {
	
	public static void NumberOgDigit(int num) {
		System.out.println("the no of digits in "+num);
		int nd=0;
		
		while(num>0) {
			
			nd=nd+1;
			num=num/10;
			
		}System.out.println(nd);
		
	}

	public static void main(String[] args) {

		NumberOgDigit(17);

	}

}
