
import java.util.InputMismatchException;


public class main {
    public void paymentConfig() {
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
                        addPayment();
                        break;
                    case 2:
                        viewPayment();
                        break;
                    case 3:
                        editPayment();
                        break;
                    case 4:
                        deletePayment();
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

    private void addPayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewPayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void editPayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deletePayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
