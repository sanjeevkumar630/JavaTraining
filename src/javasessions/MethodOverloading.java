package javasessions;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.sum();
		m.sum(10);
		m.sum(10, 20);

	}
public static void main(int p) {   // we can overload main method also
		
		

	}

	public void sum() {
		
		System.out.println("sum method zero param");

	}

	public void sum(int i) {
		
		System.out.println("sum method one param");
		System.out.println(i);
		

	}

	public void sum(int i, int j) {
		
		System.out.println("sum method two param");
		System.out.println(i+j);

	}
}
