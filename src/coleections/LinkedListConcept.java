package coleections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
	
		l.add("manual");
		l.add("automation");
		l.add("selenium");
		
		System.out.println(l);
		System.out.println(l.size());
		
		l.addFirst("salesforce");
		l.addLast("java");
		
		System.out.println(l);
		System.out.println(l.size());
		
		l.remove(0);
		System.out.println(l);
		
		for(int i=0; i<l.size();i++) {  // for loop
			
			System.out.println(l.get(i));
			
		} for(String str: l) {      // for each loop
			System.out.println(str);
		}
	}

}
