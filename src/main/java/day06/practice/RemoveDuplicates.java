package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	public static List<String> removeDups(List<String> sourceList){
		
		List<String> uniqueCity = new ArrayList<String>();
		
		for(String city : sourceList) {
			if(!uniqueCity.contains(city)) {
				uniqueCity.add(city);
			}
		}
		
		return (uniqueCity);
	}
	
	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		System.out.println(RemoveDuplicates.removeDups(cityList));
		
	}

}
