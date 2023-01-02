package javasessions;

public class IncrementAndDecrementConcept {

	public static void main(String[] args) {

		int i = 1;
		int j = i++; // post increment
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("=================");
		
		int a = 10;
		int b = ++a; // pre increment

		System.out.println(a);
		System.out.println(b);
		System.out.println("=================");
		
		int c = 1;
		int d = c--; //post decrement
		
		System.out.println(c);
		System.out.println(d);
		System.out.println("=================");
		
		int k = 1;
		int l = --k;  //pre decrement
		
		System.out.println(k);
		System.out.println(l);
		System.out.println("=================");
	}

}
