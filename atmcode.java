import java.util.Scanner;

public class ATM {
    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("ATM Machine");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");
        System.out.print("Choose the operation: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using our ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please choose again.");
                displayMenu();
        }
    }

    private static void withdraw() {
        System.out.println("Enter money to be withdrawn: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds! Please try again.");
        } else {
            balance -= amount;
            System.out.println("Your money has been successfully withdrawn.");
            displayMenu();
        }
    }

    private static void deposit() {
        System.out.println("Enter money to be deposited: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Your money has been successfully deposited.");
        displayMenu();
    }

    private static void checkBalance() {
        System.out.println("Balance: " + balance);
        displayMenu();
    }
}