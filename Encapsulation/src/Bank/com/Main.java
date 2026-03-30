package Bank.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create account
        Bankaccount acc = new Bankaccount(101, "Vaishnavi", 1000);

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + acc.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;

                case 4:
                    System.out.println("Thank you for using bank system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}