package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class RemoveDups{
	
	public static Set<Integer> RemoveDuplicate(ArrayList<Integer> inputArray) {
		HashSet<Integer> outputArray = new HashSet<Integer>(inputArray);
		return outputArray;
		
	}
}

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(13);
		numbers.add(4);
		numbers.add(5);
		numbers.add(1);
		numbers.add(1);
		
		Set<Integer> result = RemoveDups.RemoveDuplicate(numbers);
		System.out.println(result);
	}

}
