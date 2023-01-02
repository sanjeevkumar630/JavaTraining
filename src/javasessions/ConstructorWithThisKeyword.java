package javasessions;

public class ConstructorWithThisKeyword {
	
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name=name; // if you want to access class variable use this keyword
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword c=new ConstructorWithThisKeyword("sanjeev", 30);
		ConstructorConcept c1=new ConstructorConcept();
		ConstructorConcept c2=new ConstructorConcept(10);

	}

}
