package collectioninJava;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList ll  = new LinkedList();
		
		ll.add("Rohan");
		ll.add(10);
		ll.addFirst("Ashu");
		ll.addLast(null);
		ll.set(1, "Rishi");
		//ll.remove(10);
		ll.removeLast();
		
		System.out.println("List" + ll);

	}

}
