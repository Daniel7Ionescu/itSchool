package session11_abstraction.challenges.abstract_class_bank;

public class BankA extends Bank{

    private int balance;
    public BankA(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
