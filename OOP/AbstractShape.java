
import java.util.Scanner;

// Abstract class
abstract class Shape {

    // Abstract method
    abstract double area();
}


// Circle class
class Circle extends Shape {

    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Calculate area of circle
    double area() {
        return Math.PI * radius * radius;
    }
}


// Rectangle class
class Rectangle extends Shape {

    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Calculate area of rectangle
    double area() {
        return length * width;
    }
}


// Main class
public class AbstractShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter radius: ");
            double r = sc.nextDouble();

            Circle circle = new Circle(r);
            System.out.println("Area of Circle: " + circle.area());

        } else if (choice == 2) {

            System.out.print("Enter length: ");
            double l = sc.nextDouble();

            System.out.print("Enter width: ");
            double w = sc.nextDouble();

            Rectangle rect = new Rectangle(l, w);
            System.out.println("Area of Rectangle: " + rect.area());

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}