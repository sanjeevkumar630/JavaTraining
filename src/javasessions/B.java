package javasessions;

public class B extends A {

	public B() {
		 // if you want to access all A class constrctors use constructor mapping
		System.out.println("child default constr");
	}

	public B(int i) { // if you want to access all A class constrctors use constructor mapping
		super(i);
	}

	public B(int i, int j) { // if you want to access all A class constrctors use constructor mapping
		super(i, j);
	}

	public static void main(String[] args) {

		B b = new B();

		B b1 = new B(10);
		B b2 = new B(10, 20);

	}

}
