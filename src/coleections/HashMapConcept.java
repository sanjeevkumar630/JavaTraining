package coleections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> h=new HashMap<Integer, String>();
		
		h.put(1, "Selenium");
		h.put(2, "Qtp");
		h.put(3, "Protrcter");
		h.put(4, "Jenkins");
		
		for(Entry m: h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		 h.remove(3);
		 System.out.println(h);
		
		 HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		 
		 Employee e1=new Employee("sanjeev", 30, "NOJob");
		 Employee e2=new Employee("pradeep", 30, "Dev");
		 Employee e3=new Employee("Anudeep", 30, "cloud");
		 
		 emp.put(1, e1);
		 emp.put(2, e2);
		 emp.put(3, e3);
		 
		 for(Entry<Integer, Employee> m : emp.entrySet()) {
			 
			 int key=m.getKey();
			 Employee e=m.getValue();
			 
			 System.out.println(key+ " info ");
			 
			 System.out.println(e.name+" "+e.age+" "+e.dept);
			 
		 }
		 
		 
		 
		 
	}

}
