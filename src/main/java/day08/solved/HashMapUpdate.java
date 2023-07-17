package day08.solved;

import java.util.*;

public class HashMapUpdate {
	
	public static void main(String[] args) {
		
//		declaring a hashmap named empCount
		Map<String, Integer> empCount = new HashMap<String, Integer>();
		
//		adding elements
		empCount.put("HR", 10);
		empCount.put("Designer", 20);
		empCount.put("Front-End Developer", 50);
		empCount.put("Back-End Developer", 25);
		empCount.put("Tester", 35);
		
//		modify back-end devs count
		int count = empCount.get("Back-End Developer");
		count += 35;
		empCount.put("Back-End Developer", count);
		
//		Iterating each employee
		for(String position : empCount.keySet()) {
			System.out.println(position + ":" + " " + empCount.get(position));
		}
		
		
	}

}

