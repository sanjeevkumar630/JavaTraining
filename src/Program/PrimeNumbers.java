package Program;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;

			}

		}
		return true;
	

	}

	public static void getPrimeNumbers(int num) {
		
		System.out.println("prime no's up to  :"+ num);

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);

			}
		}

	}

	public static void main(String[] args) {

		System.out.println("1 is prime number  :" + isPrimeNumber(1));
		System.out.println("15 is prime number  :" + isPrimeNumber(15));
		System.out.println("20 is prime number  :" + isPrimeNumber(20));
		System.out.println("2 is prime number  :" + isPrimeNumber(2));
		System.out.println("9 is prime number  :" + isPrimeNumber(9));
		 
		getPrimeNumbers(9);
		getPrimeNumbers(20);

	}

}
