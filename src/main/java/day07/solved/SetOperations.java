package day07.solved;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer> ();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		
		Set<Integer> set2 = new HashSet<Integer> ();
		set2.add(1);
		set2.add(2);
		set2.add(6);
		
		
//		union adding two set
		Set<Integer> unionSet = new HashSet<Integer>(set1);
		unionSet.addAll(set2);
		System.out.println(unionSet);
		
//		Intersection returning common elements
		Set<Integer> intersectionSet = new HashSet<Integer>(set1);
		intersectionSet.retainAll(set2);
		System.out.println(intersectionSet);
		
//		Difference remove common elements and return unique elements 
		Set<Integer> differenceSet = new HashSet<Integer>(set1);
		differenceSet.removeAll(set2);
		System.out.println(differenceSet);
	}

}
