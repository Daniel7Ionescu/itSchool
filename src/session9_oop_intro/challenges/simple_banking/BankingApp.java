package session9_oop_intro.challenges.simple_banking;

public class BankingApp {

    public static void main(String[] args) {
        Account acc1 = new Account("Randy", "Marsh", 2000);

        System.out.println("Starter balance: " + acc1.getAccountBalance());

        //making some transfers and logging them
        acc1.makeTransfer(-100);
        acc1.makeTransfer(400);
        acc1.makeTransfer(-2000);
        acc1.printAccountLog();

        //checking my current balance
        System.out.println("Current balance: " + acc1.getAccountBalance());
    }
}
