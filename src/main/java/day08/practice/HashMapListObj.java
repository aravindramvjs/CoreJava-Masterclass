package day08.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapListObj {
    public static void main(String[] args) {
        
        TreeMap<String, List<String>> departmentEmployeeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter department name and employee name type exit to stop the loop:");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("exit")) {
            String[] parts = input.split(",");
            String department = parts[0].trim();
            String employee = parts[1].trim();

            if (departmentEmployeeMap.containsKey(department)) {//IT
                List<String> employees = departmentEmployeeMap.get(department);
                employees.add(employee);
            } 
            else {
            	List<String> employees = new ArrayList<String>();
                employees.add(employee);//ARAVIND ADD
                departmentEmployeeMap.put(department, employees);//IT: ARAVIND
            }

            input = scanner.nextLine();
        }

        scanner.close();

        for (String department : departmentEmployeeMap.keySet()) {
            List<String> employees = departmentEmployeeMap.get(department);
            Collections.sort(employees);   
            
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
