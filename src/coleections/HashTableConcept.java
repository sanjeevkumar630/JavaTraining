package coleections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h=new Hashtable();
		h.put('A', "Test");
		h.put('B', "Case");
		h.put('C', "Review");
		
		System.out.println(h.size());
		
		System.out.println("======================");
		
		h.put(1, "sanjeev");
		h.put(2, "kumar");
		h.put(3, "goodboy");
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		System.out.println(h.get(2));
		System.out.println(h.get('A'));
		System.out.println("======================");
		
		//System.out.println(h);
		
		Set keys=h.keySet();
		
		Iterator itr=keys.iterator();
		
		while (itr.hasNext()) {
			
			Object str=itr.next();
			
			System.out.println("keys:"+str+"  & values:  "+h.get(str) );
			
		}
		
		
		
		
		

	}

}
