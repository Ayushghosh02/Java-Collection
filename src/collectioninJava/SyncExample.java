package collectioninJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncExample {

	public static void main(String[] args) {
		List<String> table = Collections.synchronizedList(new ArrayList<>());
		
		synchronized (table) {
			table.add("Ayush");
			table.add("Ankur");
		}
		System.out.println("synchronized Table" + table);

	}

}
