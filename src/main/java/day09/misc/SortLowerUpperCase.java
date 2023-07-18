package day09.misc;

import java.util.*;

public class SortLowerUpperCase {
	
	public static void main(String[] args) {
		
		List<String> alphabets = new ArrayList<String>();
		alphabets.add("K");
		alphabets.add("J");
		alphabets.add("N");
		alphabets.add("A");
		alphabets.add("Z");
		alphabets.add("T");
		alphabets.add("a");
		
//		Sort both upper and lower 
		Collections.sort(alphabets, String::compareToIgnoreCase);
		System.out.println(alphabets);
		
		List<Double> nums = new ArrayList<Double>();
		nums.add(100.5);
		nums.add(10.2);
	
		Collections.sort(nums);
		System.out.println(nums);
	}

}
