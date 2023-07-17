package day08.practice;

import java.util.*;

public class HashMapListObj {
    public static void main(String[] args) {
        
        HashMap<String, List<String>> departmentEmployeeMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter department name and employee name (comma-separated, type 'exit' to stop):");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("exit")) {
            String[] parts = input.split(",");
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

            input = scanner.nextLine();
        }

        scanner.close();

        for (Map.Entry<String, List<String>> entry : departmentEmployeeMap.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();

            System.out.print(department + ": ");
            for (int i = 0; i < employees.size(); i++) {
                System.out.print(employees.get(i));
                if (i != employees.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
