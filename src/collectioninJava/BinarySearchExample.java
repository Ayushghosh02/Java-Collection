package collectioninJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		
		List <Integer> number = Arrays.asList(10,90,30,80,40,50);
		
		Collections.sort(number);
		System.out.println("Sort number" + number);
		
		int index = Collections.binarySearch(number, 30);
		System.out.println("Element found at index: " + index);
		

	}

}
