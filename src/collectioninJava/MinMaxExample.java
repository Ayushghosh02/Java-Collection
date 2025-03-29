package collectioninJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxExample {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,1,5,6,7,8,9);
		
		System.out.println("Min value" + Collections.min(number));
		System.out.println("Max value" + Collections.max(number));
		
		

	}

}
