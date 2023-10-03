package session9_oop_intro.challenges.simple_banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {

    private UUID accountID;
    private String firstName;
    private String lastName;
    private double initialDeposit;
    private double accountValue;
    private List<String> accountLog = new ArrayList<>();

    public Account(String firstName, String lastName, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initialDeposit = initialDeposit;
        makeTransfer(initialDeposit);
        setAccountID();
    }

    public void makeTransfer(double value) {
        accountValue += value;
        logTransfer(value);
    }

    private void logTransfer(double value) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMMM-yyyy 'at' HH:mm:ss");
        LocalDateTime trasferDate = LocalDateTime.now();
        String formattedDate = trasferDate.format(pattern);
        //deposit
        if (accountValue < accountValue + value) {
            accountLog.add("Deposited: " + value + " on: " + formattedDate + " - Updated balance: " + accountValue);
        }
        //withdraw
        else if (accountValue > accountValue + value) {
            accountLog.add("Withdrew: " + (-value) + " on: " + formattedDate + " - Updated balance: " + accountValue);
        }
    }

    public double getAccountBalance() {
        return accountValue;
    }

    public void printAccountLog() {
        for (String log : accountLog) {
            System.out.println(log);
        }
    }

    private void setAccountID() {
        accountID = UUID.randomUUID();
    }

    public UUID getAccountID() {
        return accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }
}
