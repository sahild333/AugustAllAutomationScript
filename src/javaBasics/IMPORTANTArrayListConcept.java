package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class IMPORTANTArrayListConcept {

	public static void main(String[] args) {
		// Problem in Arrays - dataType restriction/ size restriction/ less number of defined methods
		// Why ArrayList - dataType restriction/ size restriction/ a lot of defined methods
		
		ArrayList a = new ArrayList(); // warning -> do parameterized arraylist (don't have to)
		a.add("Java"); //add() -> to insert values .add()
		a.add(100);
		a.add(true);
		a.add('x');
		
		System.out.println(a.get(2)); //get() -> to get value out .get()
		System.out.println(a.get(0));
		System.out.println(a.size()); //size() -> to get number of rows .size()
		for(int i=0; i<a.size(); i++) {
	//		System.out.print(a.get(i) +" ");
		}
		
		ArrayList<String> b = new ArrayList<String>(); //parameterized arrayList/have to add<>
	//	b.add(10); // can't add, has to be string
		b.add("Tom");
		b.add("John");
		b.add("Eva");
		
		System.out.println(b.contains("Tommy")); //contains() = checking if present or not (boolean) //false
		System.out.println(b.contains("tom")); // case sensitive //false
		
		System.out.println(b.equals("Eva")); //false because equals() compares to array itself
		
		ArrayList<String> c = new ArrayList<String>(); //parameterized arrayList/have to add<>
		c.add("Tom");
		c.add("John");
		c.add("Eva");
		
		System.out.println(b.equals(c)); // true because equals() => comparing two arrays
		//case sensitive, position sensitive//has to be exactly the same
		
		System.out.println("Position of John is: "+b.indexOf("John")); //indexOf() -> returning position of value
		//prints 1 because of index counting (0,1,2,3...)
		
		b.add("Jacky");
		b.add("Tom"); //duplicate value can be added
		
		for(String x: b) { //for each loop
			System.out.print(x+" "); //prints all values in array/ String x: b/ use semicolon/ semicolon focuses String x to array b
		}
		
		b.remove(4); //removes Tom//Tom in 4th index
		System.out.println(" ");
		for(String x: b) { 
			System.out.print(x+" ");
		}
		
		System.out.println(" ");
		System.out.println(c.size());
		c.removeAll(c); // removeAll() => removes all values
		System.out.println(c.size());
		
		Iterator<String> it = b.iterator(); //traversing with the use of iterator
		//System.out.println(it);
		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//study 1d arrays, 2d arrays, arraylist
		// IMPORTANT - remember the 3 ways to traverse data from arraylist
	}

}
