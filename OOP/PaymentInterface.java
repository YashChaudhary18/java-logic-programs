/* Implement interface PaymentMethod. */
import java.util.Scanner;

// Interface
interface PaymentMethod {

    // Abstract method
    void pay(double amount);
}


// CreditCard class implementing interface
class CreditCard implements PaymentMethod {

    String cardNumber;

    // Constructor
    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implement pay method
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Credit Card: " + cardNumber);
    }
}


// UPI class implementing interface
class UPI implements PaymentMethod {

    String upiId;

    // Constructor
    UPI(String upiId) {
        this.upiId = upiId;
    }

    // Implement pay method
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using UPI: " + upiId);
    }
}


// Main class
public class PaymentInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (choice == 1) {

            System.out.print("Enter Credit Card Number: ");
            String card = sc.next();

            PaymentMethod payment = new CreditCard(card);
            payment.pay(amount);

        } else if (choice == 2) {

            System.out.print("Enter UPI ID: ");
            String upi = sc.next();

            PaymentMethod payment = new UPI(upi);
            payment.pay(amount);

        } else {
            System.out.println("Invalid option.");
        }

        sc.close();
    }
}
