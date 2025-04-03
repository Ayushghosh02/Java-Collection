package collectioninJava;

import java.util.ArrayList;
import java.util.List;

public class AddDelUpdinArrayList {

	public static void main(String[] args) {
		
		// Creating an ArrayList of Strings
		ArrayList<String> ls = new ArrayList<>();
		
		ls.add("Mango");
		ls.add("Apple");
		ls.add("Banana");
		System.out.println("Arraylist: " + ls);
		
		 // Adding elements
		ls.add(1,"Cherry");  // at specific position
		ls.add("Papaya");    // at end
		System.out.println("Arraylist: " + ls);
		
		//Accessing Elements
		String lang = ls.get(1);
		System.out.println("Accessing element: " + lang);
		
		
		//Modifying Elements
		ls.set(2, "Orange");
		System.out.println("Arraylist: " + ls);
		
        //Removing Elements
		ls.remove(3);           // Removes element at index 2
		ls.remove("Mango");    // Removes "papaya"
		System.out.println("Arraylist: " + ls);

		
		
		
		

	}

}
