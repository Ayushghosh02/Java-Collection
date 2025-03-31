package collectioninJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shwet" ,"Sahil", "Kashyap", "Ankit");
		
		Collections.sort(names);                       // Assending order
		System.out.println("Name" + names);
	
		
		Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Sorted List: " + names); // Reverse order
		

	}

}
