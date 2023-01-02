package Program;

public class palindromeNumber {
	
	public static void isPalindromeNumber(int num) {
		
		int r=0;
		int sum=0;
		int t;
		t=num;
		
		while(num>0) {
			
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		

		if(t==sum) {
		//System.out.println(sum);
		System.out.println("the given no is polindrome");
		}else {
			System.out.println("the given no is not polindrome");
		}
		
		
	}

	public static void main(String[] args) {
		isPalindromeNumber(789);
		
		
	}

}
