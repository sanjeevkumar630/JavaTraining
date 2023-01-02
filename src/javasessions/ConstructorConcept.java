package javasessions;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("this is default const");
	}

	public ConstructorConcept(int i) {
		System.out.println("this is single argument const");
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("this is two params const");
	}

	public static void main(String[] args) {

		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(10, 20);
	}

}
