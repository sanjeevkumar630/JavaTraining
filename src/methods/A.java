package methods;

public class A {

	public void m1() { // non static method
		System.out.println("from A m1");
		// m2();

	}
	public A() {
		System.out.println("sanj");
		//m1() ;
	}

	public static void m1( String str) { // Static method
		System.out.println("from A m2");
		// A a=new A();
		// a.m1();
		

	}
	public  A(String str) {
		System.out.println("raj");
		
	}

	public void m3() {
		System.out.println("from A m3");
		m1();
		
	}

	public static void main(String[] args) {
	A a=new A();
	A a1=new A("sanjeev");
	//new A().m1("sanjeev");

		 
		
	}

}
