package session10.challenges.bank_account_management_system;

import java.util.UUID;

public class BankAccount {
    private UUID accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        setAccountNumber();
    }

    public void transferFunds(BankAccount targetAccount, double amount){
        if(amount <= 0 || amount > balance){
            System.out.println("Invalid amount!");
            return;
        }
        targetAccount.deposit(amount);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void getAccountDetails() {
        System.out.println("Account holder: " + accountHolderName + " id: " + accountNumber +
                "\nCurrent balance: " + balance);
    }

    private void setAccountNumber() {
        accountNumber = UUID.randomUUID();
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
