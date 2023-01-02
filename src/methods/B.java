
package methods;

public class B extends A {

	public  void m1() { // non static method
		//super.m1();
		System.out.println("from B m1");
		
		// a.m2();
		// A.m2();
	}
	
	public B() {
		System.out.println("raghu");
	}public B(String str) {
		super(str);
		
		System.out.println("raggg");
	}

	public static void m2() { // Static method
		System.out.println("from B m2");
		
		
	}

	public void m3() {
		super.m1();
		System.out.println("from B m3");
		
		m2();
	}

	public static void main(String[] args) {
		
		
		
		 // B b = new B(); 
		  //b.m1();
		  B b1=new B("sasasdd");
		 
		  
		 // b.m3();
		 
		
			/*
			 * A a=new B(); a.m1(); a.m1("sanjeev"); a.m3();
			 */
		
		
		

		// B b=new B();
		// b.m1();
		// B.m2();

	}

}
