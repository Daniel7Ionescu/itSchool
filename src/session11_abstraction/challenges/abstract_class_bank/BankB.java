package session11_abstraction.challenges.abstract_class_bank;

public class BankB extends Bank{
    private int balance;
    @Override
    int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
