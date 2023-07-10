package day03.practice;

class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int empid, String empname) {
        this.id = empid;
        System.out.printf("Employee Id: %d ", id);
        this.name = empname;
        System.out.printf("Employee Name: %s\n", name);
    }
}

public class ContructEmployee {

	public static void main(String[] args) {
		
		 Employee e1 = new Employee(1, "naresh");
		 Employee e2 = new Employee(2, "suresh");
		 
	}
}
