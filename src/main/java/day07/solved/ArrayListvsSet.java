package day07.solved;

import java.util.*;

public class ArrayListvsSet {
	
	public static void main(String[] args) {
		
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Madurai");
		cityNames.add("Tirunelveli");
		cityNames.add("Chennai");
		cityNames.add("Chennai");
		
		System.out.println("Using ArrayList : " + cityNames);
		
		Set<String> cities = new HashSet<String>(cityNames);
		System.out.println("Using HashSet: " + cities);
		
	}

}
