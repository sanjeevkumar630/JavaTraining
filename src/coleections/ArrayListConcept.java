swetha12package coleections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList < Object>ar=new ArrayList<Object>();
		ar.add("sanjeev");
		ar.add(12);
		ar.add(439.12);
		System.out.println(ar.size());
		
		System.out.println("=================");
		
		ar.add("tom");
		ar.add("arun");
		ar.add("sanjay");
		System.out.println(ar.size());
		System.out.println(ar);
		
		System.out.println("=================");
		
		ar.remove(4);
		System.out.println(ar.size());
		System.out.println(ar);
		
		System.out.println("=================");
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
			
		} System.out.println("============");
			  for(Object str:ar) {
			 System.out.println(str);
			  
			  }
			 
	}

}
