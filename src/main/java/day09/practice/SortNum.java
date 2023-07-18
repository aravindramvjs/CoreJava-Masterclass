package day09.practice;

import java.util.*;

public class SortNum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		List<Integer> inputList = new ArrayList<Integer>();
		
		while (scan.hasNext()) {
			
			int inputNum = scan.nextInt();
			
			if(inputNum == -1) {
				break;
			}
			
			inputList.add(inputNum);
		}
		
		Collections.sort(inputList);
		
		System.out.println(inputList);
		
	}
	
}
