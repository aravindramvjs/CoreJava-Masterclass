package day08.solved;

import java.util.*;

public class HashMapCreate {
	
	public static void main(String[] args) {
		
//		declaring a hashmap named empCount
		HashMap<String, Integer> empCount = new HashMap<String, Integer>();
		
//		adding elements
		empCount.put("HR", 10);
		empCount.put("Designer", 20);
		empCount.put("Front-End Developer", 50);
		empCount.put("Back-End Developer", 25);
		empCount.put("Tester", 35);

		
//		Iterating each employee
		for(String position : empCount.keySet()) {
			System.out.println(position + ":" + " " + empCount.get(position));
		}
		
		
	}

}
