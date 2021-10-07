package org.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class set {
	
	public static void main(String[] args) {
		// list
		//a array list
		List r = new ArrayList();
 		r.add(122);                            // add method
		r.add("ram");
		r.add(21);
		System.out.println(r);
		int size = r.size();
		System.out.println(size);             // size method
		Object object = r.get(2);             // get method
		System.out.println(object);
		System.out.println("next");
		for (int i = 0; i < r.size(); i++) {    // for loop 
		Object object2 = r.get(i);
			System.out.println(object2);
			for (Object object3 : r) {           // enhanced for loop
				System.out.println(object3);}
			r.remove(1);                          //remove method
			System.out.println(r);
			r.retainAll(r);                       //retain method
			System.out.println(r);
			r.add(10);
			r.add(20);
			r.add(2,30);
			System.out.println(r);
			System.out.println("abcd");
			System.out.println("abcd");
			
			
			
			
			
			
			
			
		}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


