package Program;

public class ReverseNumber {
	
	public static void getReverseNumber(int num) {
		System.out.println("the reverse no of "+  num  +" is");
		int rno=0;
		while(num>0) {
			rno=(rno*10)+num%10;
			num=num/10;
		}
		System.out.println(rno);
	}

	public static void main(String[] args) {
		getReverseNumber(245);


	}

}
