package day06.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicates {
	
	@Test
	public void TestRemoveDups() {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		List<String> actualList = RemoveDuplicates.removeDups(cityList);
		
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Chennai");
		expectedList.add("Bangalore");
		expectedList.add("Mumbai");
		
		
		Assertions.assertIterableEquals(expectedList, actualList);
		
	}

}
