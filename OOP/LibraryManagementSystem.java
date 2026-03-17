/* Create Library Management System classes (Book, Member). */
class Book {

    // Attributes of Book
    int bookId;
    String title;
    String author;
    boolean isIssued;

    // Constructor to initialize book details
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
        System.out.println();
    }

    // Method to issue book
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Method to return book
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }
}


// Member class
class Member {

    int memberId;
    String name;

    // Constructor
    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Display member details
    void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + name);
    }
}


// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Creating book object
        Book book1 = new Book(101, "Java Programming", "James Gosling");

        // Creating member object
        Member member1 = new Member(1, "Rahul");

        // Display information
        System.out.println("Book Details:");
        book1.displayBook();

        System.out.println("Member Details:");
        member1.displayMember();

        // Issue and return book
        book1.issueBook();
        book1.returnBook();
    }
}
