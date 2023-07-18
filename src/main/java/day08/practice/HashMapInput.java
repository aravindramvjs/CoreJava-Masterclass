package day08.practice;

import java.util.*;

public class HashMapInput {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the names: ");
		String input = scan.nextLine();
		
		scan.close();
		
		String[] names = input.split(", ");
	
		
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
