package collectioninJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseExample {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("Mumbai", "Bhopal","Bengaluru","Indore");
		Collections.reverse(city);
		System.out.println("reverse order of cities" + city);
	}

}
