package javasessions;

public class StaticVsNonStatic {

	String name = "Sanjeev Kumar";

	static int age = 25;

	public static void main(String[] args) {

		System.out.println(age);
		demo();

		StaticVsNonStatic s = new StaticVsNonStatic();

		s.sum();
		System.out.println(s.name);

	}

	public void sum() {
		System.out.println("sum method)");
	}

	public static void demo() {
		System.out.println("demo method");
	}

}
