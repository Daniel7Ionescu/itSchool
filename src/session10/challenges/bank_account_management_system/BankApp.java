package session10.challenges.bank_account_management_system;

public class BankApp {

    public static void main(String[] args) {
        BankAccount accountMike = new BankAccount("Mike");
        BankAccount accountTom = new BankAccount("Tom");
        accountMike.getAccountDetails();
        accountTom.getAccountDetails();

        System.out.println("*Try to deposit a negative amount");
        accountMike.deposit(-200);
        System.out.println("*Deposit 500");
        accountMike.deposit(500);
        System.out.println("*Try to withdraw a greater amount than the current balance");
        accountMike.withdraw(700);
        System.out.println("*Withdraw 300");
        accountMike.withdraw(300);

        accountMike.getAccountDetails();
        System.out.println("*Transfer funds to another account");
        accountMike.transferFunds(accountTom, 100);
        accountTom.getAccountDetails();
    }
}
