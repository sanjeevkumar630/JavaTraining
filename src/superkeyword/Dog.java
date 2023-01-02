package superkeyword;

public class Dog extends Animal {
	
	String color="red";   //instance variable

	public Dog() {   // default constructor
		super();  // calling parent class default constructor
		System.out.println("from Dog default const");
	}

	public Dog(String str) {  // param constructor
		super(str);  //calling parent class param constructor
		System.out.println("from Dog param const");
	}

	public void m1() { // instance method
		System.out.println("from dog m1");
	}

	public void work() {
		System.out.println(super.color);  // calling parent class instance variable
		System.out.println(color);  // calling current class instance variable
		super.m1();  // calling parent class method
	

	}

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.work();
		Dog d1=new Dog("sanjeev");

	}

}
