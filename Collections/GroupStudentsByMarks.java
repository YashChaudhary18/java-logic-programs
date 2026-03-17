/* Group students by marks using HashMap. */
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

public class GroupStudentsByMarks {

    public static void main(String[] args) {

        // Create student list
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 85));
        students.add(new Student(2, "Aman", 90));
        students.add(new Student(3, "Priya", 85));
        students.add(new Student(4, "Neha", 90));
        students.add(new Student(5, "Arjun", 75));

        // Display all students
        System.out.println("All Students:");
        for (Student s : students) {
            s.display();
        }

        // HashMap to group students by marks
        Map<Integer, List<String>> map = new HashMap<>();

        for (Student s : students) {

            // Create list if marks key does not exist
            map.putIfAbsent(s.marks, new ArrayList<>());

            // Add student name to marks group
            map.get(s.marks).add(s.name);
        }

        // Display grouped students
        System.out.println("\nStudents grouped by marks:");

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
