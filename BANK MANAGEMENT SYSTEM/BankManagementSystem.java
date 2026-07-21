import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountName = "";
        String accountNumber = "ACC1001";
        int pin = 0;
        double balance = 0;
        int choice;

        while (true) {

            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Account Holder Name: ");
                accountName = sc.nextLine();

                System.out.print("Enter Initial Balance: ");
                balance = sc.nextDouble();

                System.out.print("Set 4-digit PIN: ");
                pin = sc.nextInt();

                System.out.println("\nAccount Created Successfully!");
                System.out.println("Account Number: " + accountNumber);

            } else if (choice == 2) {

    System.out.print("Enter Account Number: ");
    String acc = sc.next();

    System.out.print("Enter PIN: ");
    int enteredPin = sc.nextInt();

    if (acc.equals(accountNumber) && enteredPin == pin) {

        System.out.println("\nLogin Successful!");

        int option;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Logout");

            System.out.print("Enter your option: ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Deposit Successful!");
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.println("Account Holder : " + accountName);
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Logged Out Successfully!");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        } while (option != 4);

    } else {

        System.out.println("Invalid Account Number or PIN");
    }

            } else if (choice == 3) {

                System.out.println("Thank You!");
                break;

            } else {

                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}