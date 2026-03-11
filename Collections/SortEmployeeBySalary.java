import java.util.*;

// Employee class
class Employee {

    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary);
    }
}

public class SortEmployeeBySalary {

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rahul", 50000));
        employees.add(new Employee(2, "Aman", 70000));
        employees.add(new Employee(3, "Priya", 45000));
        employees.add(new Employee(4, "Neha", 80000));
        employees.add(new Employee(5, "Arjun", 60000));

        // Display all employees
        System.out.println("All Employees:");
        for (Employee e : employees) {
            e.display();
        }

        // Sort employees by salary descending
        Collections.sort(employees, (e1, e2) -> Double.compare(e2.salary, e1.salary));

        // Display sorted employees
        System.out.println("\nEmployees sorted by salary (descending):");

        for (Employee e : employees) {
            e.display();
        }
    }
}