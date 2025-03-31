package collectioninJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		Collections.sort(number);
		System.out.println("Accesnding order of number" + number);
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println("Decending order of number" + number);
		

	}

}
