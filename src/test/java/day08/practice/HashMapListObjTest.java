package day08.practice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapListObjTest {

    @Test
    public void testProcessDepartmentEmployeeInput_SingleDepartmentAndEmployee() {
        String input = "IT, John\n";
        TreeMap<String, List<String>> expectedOutput = new TreeMap<>();
        expectedOutput.put("IT", Collections.singletonList("John"));

        TreeMap<String, List<String>> result = HashMapListObj.processDepartmentEmployeeInput(input);

        assertEquals(expectedOutput, result, "Single department and employee");
    }

    @Test
    public void testProcessDepartmentEmployeeInput_MultipleDepartmentsAndEmployees() {
        String input = "HR, Alice\nIT, Bob\nHR, David\nIT, Eve\n";
        TreeMap<String, List<String>> expectedOutput = new TreeMap<>();
        expectedOutput.put("HR", Arrays.asList("Alice", "David"));
        expectedOutput.put("IT", Arrays.asList("Bob", "Eve"));

        TreeMap<String, List<String>> result = HashMapListObj.processDepartmentEmployeeInput(input);

        assertEquals(expectedOutput, result, "Multiple departments and employees");
    }
}
