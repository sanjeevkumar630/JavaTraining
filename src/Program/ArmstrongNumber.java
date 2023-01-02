package Program;

public class ArmstrongNumber {
	
	public static void isArmstrong(int num) {
		
		System.out.println(("the given no is  :" +num));
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		} if(t==cube) {
			System.out.println("this is an Armstrong number");
		}else {
			System.out.println("this is not an Armstrong number");
		}
		
	}

	public static void main(String[] args) {

		isArmstrong(153);
		isArmstrong(152);

	}

}
