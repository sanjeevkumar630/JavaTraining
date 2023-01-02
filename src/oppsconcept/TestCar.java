package oppsconcept;

public class TestCar {

	public static void main(String[] args) {

		Bmw b = new Bmw();
		b.start();
		b.stop();
		 //b.theftsafe();
		// b.refuel();
		// b.engine();

		System.out.println("=============");

		Car c = new Car();
		//c.engine();
		//c.start();
		 //c.stop();
		 //c.refuel();

		System.out.println("=============");

		Car c1 = new Bmw(); // Dynamic Polymorphism
		c1.engine();
		c1.start();
		c1.refuel1();
		// c1.stop();
		// c1.refuel();

	}

}
