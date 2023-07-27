package day08.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHashMapInput {

    private HashMapInput hashMapInput;

    @BeforeEach
    public void setUp() {
        hashMapInput = new HashMapInput();
    }

    @Test
    public void testCountNames_withValidInput() {
        String input = "Alice, Bob, Alice, Charlie, Bob, Alice";
        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("Alice", 3);
        expectedOutput.put("Bob", 2);
        expectedOutput.put("Charlie", 1);

        Map<String, Integer> result = hashMapInput.countNames(input);

        assertEquals(expectedOutput, result, "Counts should match");
    }



    @Test
    public void testCountNames_withSingleName() {
        String input = "Alice";
        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("Alice", 1);

        Map<String, Integer> result = hashMapInput.countNames(input);

        assertEquals(expectedOutput, result, "Count of Alice should be 1");
    }

}

