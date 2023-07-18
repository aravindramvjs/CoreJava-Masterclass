package day09.solved;

import java.util.*;


//Creating student class with rollno, name and age atributes
class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Roll No: " + this.rollno + " Name: " + this.name + " Age: " + this.age;
		
	}
}


//create comparator class to sort age by overriding compare method
class AgeComparator implements Comparator<Student>{
	
	public int compare(Student s1, Student s2) {
		if(s1.age == s2.age) {
			return 0;
		}
		else if(s1.age < s2.age) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
}


//create comparator class to sort name by overriding compareTo method
class NameComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class CoparatorInterface {
	
	public static void main(String[] args) {
		
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(3, "Aravind", 19));
		studentList.add(new Student(21, "Ram", 21));
		studentList.add(new Student(1, "Vijay", 15));
		
		System.out.println("Sort using Age:");
		
		Collections.sort(studentList, new AgeComparator());
		
		System.out.println(studentList);
		System.out.println();
		
		System.out.println("Sort using Name:");
		
		Collections.sort(studentList, new NameComparator());
		
		System.out.println(studentList);
		
		
	}

}
