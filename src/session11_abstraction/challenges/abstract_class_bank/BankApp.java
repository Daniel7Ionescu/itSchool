package session11_abstraction.challenges.abstract_class_bank;

public class BankApp {

    public static void main(String[] args) {
        BankA bankA = new BankA(100);

        BankB bankB = new BankB();
        bankB.setBalance(150);

        BankC bankC = new BankC(200);

        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());
    }
}
