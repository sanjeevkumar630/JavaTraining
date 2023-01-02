package Program;

public class SumOfDigits {
	
	public static void sumOfDigit(int num) {
		
		int sd=0;
		while(num>0) {
			sd=sd+(num%10);
			num=num/10;
		} System.out.println("the sum of digits is  :"+sd);
		
	}

	public static void main(String[] args) {

		sumOfDigit(768);

	}

}
