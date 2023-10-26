package session10.practice.bank_account;

public class BankUp {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        System.out.println("Initial balance: " + acc1.checkBalance());

        acc1.deposit(500.5);
        acc1.withdraw(200.35);
        System.out.println("Current balance: " + acc1.checkBalance());
    }
}
