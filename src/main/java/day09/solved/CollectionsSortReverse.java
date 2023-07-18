package day09.solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortReverse {
	
	public static void main(String[] args) {
		
//		Method #1
		
		List<String> alphabets = new ArrayList<String>();
		alphabets.add("K");
		alphabets.add("J");
		alphabets.add("N");
		alphabets.add("A");
		alphabets.add("Z");
		alphabets.add("T");
		
		
		System.out.print("Before Sorting: ");
		System.out.println(alphabets);
		
		System.out.print("After Sorting: ");
		Collections.sort(alphabets);
		System.out.println(alphabets);
		
		System.out.print("Reversing The Order: ");
		Collections.reverse(alphabets);
		System.out.println(alphabets);
		
		System.out.println();
		
		
		
//		Method #2
		System.out.print("Reverse Sort and Ordering: ");
		Collections.sort(alphabets, Collections.reverseOrder());
		System.out.println(alphabets);
		
		
		
	}

}
