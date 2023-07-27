package day07.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestRemoveDuplicates {

    @Test
    void testRemoveDuplicateWithDuplicates() {
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(1);
        inputArray.add(3);
        inputArray.add(2);

        Set<Integer> actualOutput = RemoveDups.RemoveDuplicate(inputArray);

        Set<Integer> expectedOutput = new HashSet<>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(3);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveDuplicateWithNoDuplicates() {
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);

        Set<Integer> actualOutput = RemoveDups.RemoveDuplicate(inputArray);

        Set<Integer> expectedOutput = new HashSet<>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(3);

        assertEquals(expectedOutput, actualOutput);
    }
}
