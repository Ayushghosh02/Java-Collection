package collectioninJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,2,3,5,6,6));
		
		List<Integer> uniquelist = new ArrayList<>();
		
		for(Integer num  : list) {
			if(!uniquelist.contains(num)) {
				uniquelist.add(num);
			}
		}
		
		System.out.println("Unique List: " + uniquelist );
		

	}

}
