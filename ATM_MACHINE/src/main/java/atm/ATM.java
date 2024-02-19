package atm;

import java.util.Scanner;

public class ATM {
    private User user;
    private Scanner scanner;

    public ATM(User user) {
        this.user = user;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome, " + user.getName());

        while (true) {
            displayMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    printReceipt();
                    break;
                case 5:
                    exit();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Print Receipt");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private void checkBalance() {
        System.out.println("Current Balance: " + user.getBalance());
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        user.deposit(amount);
        System.out.println("Successfully deposited.");
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        try {
            user.withdraw(amount);
            System.out.println("Successfully withdrawn.");
        } catch (Exception e) {
            System.out.println("Insufficient balance. Try again.");
        }
    }

    private void printReceipt() {
        System.out.println("Receipt:");
        // Print transaction details
        user.receipt();
    }

    private void exit() {
        System.out.println("Thank you for using the ATM.");
    }
}
