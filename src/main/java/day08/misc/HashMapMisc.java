package day08.misc;

import java.util.*;

public class HashMapMisc {
	
	public static void main(String[] args) {
		
		String[] names = {"Aravind", "Meganathan", "Aravind", "Hemanath", "Joel", "Joel"};
		
		
		//Map Interface 					HashMap implementation class
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			if(countMap.get(name) == null) {
				countMap.put(name, 1);
			}
			else {
				int count = countMap.get(name);
				count++;
				countMap.put(name, count);
			}
		}
		
		System.out.println(countMap);
	}

}
