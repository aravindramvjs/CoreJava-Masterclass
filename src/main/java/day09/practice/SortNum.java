package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNum {
	
	public static List<Integer> sortNumbers(List<Integer> inputList) {
		Collections.sort(inputList);
		return inputList;
	}
	
	public static void main(String[] args) {

		List<Integer> inputList = new ArrayList<>();
		inputList.add(5);
		inputList.add(2);
		inputList.add(10);
		inputList.add(1);
		List<Integer> sortedList = sortNumbers(inputList);
		System.out.println(sortedList);
	}
}
