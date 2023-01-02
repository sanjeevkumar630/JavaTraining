package javasessions;

public class WrapperClass {

	public static void main(String[] args) {

		String s="100";
		
		System.out.println(s+20);
		
		int i=Integer.parseInt(s); // convert string to integer
		System.out.println(i+20);
		String s1="123.45";
		System.out.println(s1+20);
		double d=Double.parseDouble(s1); // convert string to double
		System.out.println(d+20);
		
		int j=100;
		
		System.out.println(j+20);
		
		String s2=String.valueOf(j);  //  convert integet to string
		System.out.println(s2+20);
		
		/*
		 * String s3="100A"; // it will get number format exception int
		 * k=Integer.parseInt(s3); System.out.println(k);
		 */
		
		
		
		
	}

}
