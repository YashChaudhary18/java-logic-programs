import java.util.*;

// Student class
class Student {

    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }
}

public class TopStudents {

    public static void main(String[] args) {

        // Create student list
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 85));
        students.add(new Student(2, "Aman", 92));
        students.add(new Student(3, "Priya", 78));
        students.add(new Student(4, "Neha", 95));
        students.add(new Student(5, "Arjun", 88));

        // Display all students
        System.out.println("All Students:");
        for (Student s : students) {
            s.display();
        }

        // Sort students by marks (descending order)
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);

        // Display top 3 students
        System.out.println("\nTop 3 Students with Highest Marks:");

        for (int i = 0; i < 3 && i < students.size(); i++) {
            students.get(i).display();
        }
    }
}