package coleections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableConcept2 {

	public static void main(String[] args) {

		Hashtable h1=new Hashtable();
		h1.put("A", "Test");
		h1.put("B", "Case");
		h1.put("C", "Review");
		
		Hashtable h2=new Hashtable();
		
		h2=(Hashtable) h1.clone();
		System.out.println(h1);
		System.out.println(h2);
		
		h1.clear();
		
		System.out.println(h1);
		System.out.println(h2);
		
		Hashtable h3=new Hashtable();
		
		h3.put(1, "selenium");
		h3.put(2, "Qtp");
		h3.put(3, "java");
		
		Set keys=h3.keySet();
		
		Iterator itr=keys.iterator();
		
		while (itr.hasNext()) {
			
			Object str=itr.next();
			
			System.out.println("keys:"+str+"& values:  "+h3.get(str) );
			
		}
		
		
		if(h3.containsValue("java")) {
			System.out.println("value is found");
		}
		
		

	}

}
