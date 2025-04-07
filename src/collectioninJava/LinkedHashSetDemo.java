package collectioninJava;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();
		
		h.add("B");
		h.add("A");
		h.add("D");
		h.add("K");
		h.add(null);
		h.add(10);
		
		System.out.println(h.add("A"));    // False no dublicate allowed
		System.out.println(h); 
	}

}
