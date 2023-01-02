package coleections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> h = new HashMap<Integer, Employee>();
		Employee e1=new Employee("Sanjeev", 30, "Lab");
		Employee e2=new Employee("Shiva", 31, "FrontEnd");
		Employee e3=new Employee("Anji", 32, "Selenium");
		Employee e4=new Employee("Teja", 33, "Coordinator");
		h.put(1, e1);
		h.put(2, e2);
		h.put(3, e3);
		h.put(4, e4);
		for(Entry<Integer, Employee>m:h.entrySet()) {
			
			/*
			 * int key=m.getKey(); Employee e=m.getValue();
			 * 
			 * System.out.println(key+ " info ");
			 * 
			 * System.out.println(e.name+" "+e.age+" "+e.dept);
			 */
			System.out.println(m.getKey()+" "+"Info");
			System.out.println(m.getValue().name+" "+m.getValue().age+" "+m.getValue().dept);
			
		}

	}

}
