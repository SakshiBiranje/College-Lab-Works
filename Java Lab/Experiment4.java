import java.util.Scanner;

public class Experiment4 {
    // Inner class representing a Savings Account
    public static class SavingsAccount {
        // Static variable for the annual interest rate
        private static double annualInterestRate = 0.0;

        // Instance variable for the account balance
        private double savingsBalance;

        // Constructor to initialize the savings balance
        public SavingsAccount(double balance) {
            this.savingsBalance = balance;
        }

        // Static method to set the annual interest rate
        public static void modifyInterestRate(double newRate) {
            if (newRate >= 0) {
                annualInterestRate = newRate;
            } else {
                System.out.println("Interest rate cannot be negative.");
            }
        }

        // Method to calculate monthly interest and add it to the savings balance
        public void calculateMonthlyInterest() {
            double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
            savingsBalance += monthlyInterest;
        }

        // Method to get the current savings balance
        public double getSavingsBalance() {
            return savingsBalance;
        }

        // Static method to get the current annual interest rate
        public static double getAnnualInterestRate() {
            return annualInterestRate;
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to set the annual interest rate
        System.out.println("Enter the annual interest rate :");
        double interestRate = scanner.nextDouble();
        SavingsAccount.modifyInterestRate(interestRate);

        // Creating first SavingsAccount object with user input
        System.out.println("Enter the initial balance for Saver1:");
        double balance1 = scanner.nextDouble();
        SavingsAccount saver1 = new SavingsAccount(balance1);

        // Creating second SavingsAccount object with user input
        System.out.println("Enter the initial balance for Saver2:");
        double balance2 = scanner.nextDouble();
        SavingsAccount saver2 = new SavingsAccount(balance2);

        // Calculating monthly interest for both savers and displaying the balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance: " + saver1.getSavingsBalance());
        System.out.println("Saver2 balance: " + saver2.getSavingsBalance());

        // Asking user if they want to modify the interest rate
        System.out.println("Do you want to modify the annual interest rate? (yes/no)");
        String modifyRate = scanner.next();
        if (modifyRate.equalsIgnoreCase("yes")) {
            System.out.println("Enter the new annual interest rate :");
            double newInterestRate = scanner.nextDouble();
            SavingsAccount.modifyInterestRate(newInterestRate);
        }

        // Calculating monthly interest for both savers with the new interest rate
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance after interest rate change: " + saver1.getSavingsBalance());
        System.out.println("Saver2 balance after interest rate change: " + saver2.getSavingsBalance());

        // Closing the scanner
        scanner.close();
    }
}
