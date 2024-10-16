package payment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Payment {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Payment pay = new Payment();
        int option;
        do {
            try {
                System.out.println("\n\t---Your Payment---\n");
                System.out.println("1. Add Payment");
                System.out.println("2. View Payments");
                System.out.println("3. Edit Payment");
                System.out.println("4. Delete Payment");
                System.out.println("5. Exit");

                System.out.print("\nChoose an option: ");
                option = scan.nextInt();
                scan.nextLine(); 

                switch (option) {
                    case 1:
                        pay.addPayment();
                        break;
                    case 2:
                        pay.viewPayment();
                        break;
                    case 3:
                        pay.editPayment();
                        break;
                    case 4:
                        pay.deletePayment();
                        break;
                    case 5:
                        System.out.println("Exiting Payment Menu..");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.nextLine(); 
                option = -1; 
            }
        } while (option != 5);
    }

    public void addPayment() {
        System.out.println("Enter Payment Details:");

        int paymentId;
        do {
            System.out.print("\nPayment ID: ");
            paymentId = scan.nextInt();
        } while (!validatePaymentId(paymentId)); 

        System.out.print("Amount: ");
        double amount = scan.nextDouble();
        scan.nextLine(); 

        System.out.print("Payment Date (YYYY-MM-DD): ");
        String date = scan.nextLine();

        System.out.print("Payment Method: ");
        String method = scan.nextLine();

        System.out.print("Payment Status (Pending, Paid, Cancelled): ");
        String status = scan.nextLine();

        
        System.out.println("Payment added successfully!");
    }

    private boolean validatePaymentId(int paymentId) {
        
        return paymentId > 0; 
    }

    public void viewPayment() {
        String query = "SELECT * FROM payments"; 
        System.out.println("Payment details retrieved successfully!"); 
    }

    public void editPayment() {
        System.out.print("Enter the ID of the payment you want to edit: ");
        int paymentId = scan.nextInt();

       

        System.out.println("Enter the fields you want to edit (leave blank for no change):");

        System.out.print("New Amount (if changing): ");
        String newAmount = scan.nextLine();

        System.out.print("New Payment Date (if changing) (YYYY-MM-DD): ");
        String newDate = scan.nextLine();

        System.out.print("New Payment Method (if changing): ");
        String newMethod = scan.nextLine();

        System.out.print("New Payment Status (if changing) (Pending, Paid, Cancelled): ");
        String newStatus = scan.nextLine();

        

        System.out.println("Payment updated successfully!");
    }

    public void deletePayment() {
        System.out.print("Enter the ID of the payment you want to delete: ");
        int paymentId = scan.nextInt();
    }}