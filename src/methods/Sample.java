package methods;

public class Sample {

	static int a = 100;
	int b = 200;

	public  Sample(int b) {

		
		this.b = b;
		System.out.println(b);
	}

	public static void main(String[] args) {
		Sample s = new Sample(300);
		
		System.out.println(s.b);
		
		/*
		 * System.out.println(a); System.out.println(Sample.a); ;
		 * System.out.println(s.a);
		 * 
		 */
		
	}

}
