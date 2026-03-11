1. Library Management System (Java OOP)

Overview :

This program demonstrates a simple Library Management System using Object-Oriented Programming in Java.

It includes two classes:

- Book
- Member

The program allows basic operations such as displaying book details, issuing a book, and returning a book.



Classes Used :

Book

Attributes :

- bookId
- title
- author
- isIssued

Methods :

- displayBook()
- issueBook()
- returnBook()

Member

Attributes :

- memberId
- name

Methods :

- displayMember()



Concepts Practiced :

- Object-Oriented Programming
- Classes and Objects
- Constructors
- Method implementation

---

2. Vehicle Inheritance Example (Java OOP)

Overview : 

This program demonstrates inheritance in Java using a Vehicle base class and two derived classes: Car and Bike.

Inheritance allows a child class to reuse the properties and methods of a parent class.



Class Structure : 

Vehicle (Parent Class)

Attributes :

- brand
- speed

Methods :

- displayVehicle()

Car (Child Class)

Additional attribute

- doors

Bike (Child Class)

Additional attribute

- hasGear



Concepts Practiced : 

- Inheritance
- Parent and Child Classes
- Constructor chaining using "super"
- Method reuse

---

3. Abstract Shape Example (Java OOP)

Overview

This program demonstrates abstraction in Java using an abstract class.

An abstract class "Shape" defines an abstract method "area()".
Child classes such as Circle and Rectangle extend the "Shape" class and provide their own implementation of the "area()" method.

The program allows the user to input dimensions and calculates the area of the selected shape.



Class Structure

Shape (abstract class)
   |
   ├── Circle
   └── Rectangle

Shape :

Abstract base class containing:

- "area()" → abstract method to calculate area

Circle :

Attributes:

- radius

Formula:

Area = π × r²

Rectangle :

Attributes:

- length
- width

Formula:

Area = length × width



Concepts Practiced :

- Abstract classes
- Abstract methods
- Inheritance
- Method implementation in child classes
- User input using Scanner
- Basic Object-Oriented Programming (OOP)

---

4. Payment Method Interface Example (Java)

Overview :

This program demonstrates the use of interfaces in Java.

An interface "PaymentMethod" defines a method "pay()".
Different classes implement this interface to provide different payment options.




Class Structure :

PaymentMethod (Interface)

Methods:

- pay(double amount)

Implementing Classes:

- CreditCard
- UPI

Each class defines its own implementation of the "pay()" method.



Concepts Practiced :

- Interface in Java
- Implementation of interface
- Polymorphism
- Method overriding

