package day08.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapListObj {

    public static TreeMap<String, List<String>> processDepartmentEmployeeInput(String input) {
        TreeMap<String, List<String>> departmentEmployeeMap = new TreeMap<>();

        String[] lines = input.split("\\r?\\n");

        for (String line : lines) {
            String[] parts = line.split(",");
            String department = parts[0].trim();
            String employee = parts[1].trim();

            if (departmentEmployeeMap.containsKey(department)) {
                List<String> employees = departmentEmployeeMap.get(department);
                employees.add(employee);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployeeMap.put(department, employees);
            }
        }

        return departmentEmployeeMap;
    }
}
