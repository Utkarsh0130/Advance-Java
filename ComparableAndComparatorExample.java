// This program demonstrates the use of Comparable and Comparator in Java

import java.util.*;

// Class implementing Comparable
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    // Compare students by roll number (natural order)
    @Override
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

// Comparator to compare students by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparableAndComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(103, "Bob"));
        students.add(new Student(102, "Charlie"));
        
        // Sorting using Comparable (by roll number)
        Collections.sort(students);
        System.out.println("Students sorted by roll number: " + students);
        
        // Sorting using Comparator (by name)
        Collections.sort(students, new NameComparator());
        System.out.println("Students sorted by name: " + students);
    }
}
