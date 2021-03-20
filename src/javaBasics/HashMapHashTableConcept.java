package javaBasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapHashTableConcept {

	public static void main(String[] args) {
		// HashMap - keeps data in key & value pair
		// one null key and multiple null value allowed
		// duplicate values are allowed
		
//		HashMap vs HashTable (IMPORTANT)
//		1. HashMap is non synchronized. It is not-thread safe and HashTable is synchronized and thread safe
//		2. HashMap allows one null key and multiple null values whereas HashTable doesn't allow any
//		3. HashMap is generally preferred over HashTable if thread synchronization is not needed
		
//		HashMap hm = new HashMap(); //warning - should be parameterized
//		HashMap<key,value>
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "java"); // put()- inserting key and values
		hm.put(5, "selenium");
		hm.put(3, "testNg");
		hm.put(9, "cucumber"); // values get inserted according to hashCode of key
		
		System.out.println("Size of hashMap: " +hm.size());
		
		//get() - gets value out
		System.out.println("Value point by key-3: "+hm.get(3)); // to get value out, have to provide key
		
		//entrySet() - returns all key-values
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 
		
		//keySet() - returns only key values
		System.out.println("KeySet of hashMap: "+hm.keySet());
		
		hm.put(null, "Mavin");
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 
		System.out.println(hm.get(null));
		hm.put(null, "Appium"); //if same key repeated, value is replaced (Mavin replaced by Appium)
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 
		hm.put(9, "Jira");
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 
		//if same key repeated, value is replaced 
		//Mavin replaced by Appium/ cucumber replaced by Jira
		
		hm.put(null, null);
		hm.put(10, null);
		hm.put(11, null);
		System.out.println(hm.size());
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 
		// can have duplicate values, doesn't matter if null
		
		
		//containsKey()/containsValue() - checks to see if key or value is present
		System.out.println("Is null key present: "+hm.containsKey(null)); //boolean
		System.out.println("Is Java value present: "+hm.containsValue("Java")); // false - case sensitive
		
		System.out.println(hm.hashCode());
		
		//remove() - removes value from key provided
		hm.remove(null);
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 

		//replace() - replace value from key provided
		hm.replace(10, "HP ALM");
		System.out.println("Entry set of hashMap: "+hm.entrySet()); 
		
		//values() - returns all values only
		System.out.println("All values in hashMap: "+hm.values());
		
		//To get all values of hashMap - use iterator
		//have to put iterator in keySet()
		//option 1 to traverse
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next(); //checks keys
			String value = hm.get(key); //get() - gets values
			System.out.print(value+" ");
		}
		
		//option 2 to traverse
		Iterator<Entry<Integer, String>> it1 = hm.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<Integer, String> entry = it1.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is "+key+" and value pointed is "+value);
		}
		
		
		//HASHTABLE
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // should parameterize
		ht.put(1, "Tom");
		ht.put(2, "Jerry");
		ht.put(3, "Henry");
		System.out.println(ht.entrySet());
		System.out.println(ht.keySet());
		
		//can not add null key/values in hashTable
//		ht.put(null, null); 
//		ht.put(null, "John");
//		ht.put(5, null);
		System.out.println(ht.entrySet());
		

		

		
	}

}
