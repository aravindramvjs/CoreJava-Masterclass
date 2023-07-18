package day09.solved;

import java.util.*;

public class CollectionsSortLearn {
	
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<String>();
		cities.add("Viruthunagar");
		cities.add("Chennai");
		cities.add("Madurai");
		cities.add("Tirunelveli");
		cities.add("Madras");
		cities.add("Kumbakonam");
		
		
		System.out.print("Before Sorting: ");
		System.out.println(cities);
		
		Collections.sort(cities);
		
		System.out.print("After Sorting: ");
		System.out.println(cities);
		
	}

}
