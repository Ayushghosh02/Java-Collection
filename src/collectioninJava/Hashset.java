package collectioninJava;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add("B");
		h.add("A");
		h.add("D");
		h.add("K");
		h.add(null);
		h.add(10);
		
		System.out.println(h.add("A"));    // False no dublicate allowed
		System.out.println(h);             // insertion order not preserved
		
		
		// TODO Auto-generated method stub

	}

}
