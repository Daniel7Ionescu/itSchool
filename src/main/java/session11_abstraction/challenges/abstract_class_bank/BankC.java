package session11_abstraction.challenges.abstract_class_bank;

public class BankC extends Bank {

    private int balance;

    public BankC(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
