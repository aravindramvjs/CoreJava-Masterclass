package day09.practice;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortNumTest {

    @Test
    public void testSortNumbers_EmptyList() {
        List<Integer> inputList = new ArrayList<>();
        List<Integer> expectedOutput = new ArrayList<>();
        List<Integer> result = SortNum.sortNumbers(inputList);
        assertEquals(expectedOutput, result, "Empty list should return empty list");
    }

    @Test
    public void testSortNumbers_SingleNumber() {
        List<Integer> inputList = Arrays.asList(5);
        List<Integer> expectedOutput = Arrays.asList(5);
        List<Integer> result = SortNum.sortNumbers(inputList);
        assertEquals(expectedOutput, result, "Single number list should remain unchanged");
    }

    @Test
    public void testSortNumbers_MultipleNumbers() {
        List<Integer> inputList = Arrays.asList(5, 2, 10, 1);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 5, 10);
        List<Integer> result = SortNum.sortNumbers(inputList);
        assertEquals(expectedOutput, result, "List should be sorted in ascending order");
    }
}
