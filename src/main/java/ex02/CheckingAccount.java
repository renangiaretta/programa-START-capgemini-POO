package ex02;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;

public class CheckingAccount {
    private final String accountNumber;
    private String personName;
    private double balance;

    DecimalFormat toDecimal = new DecimalFormat("0.00");


    public CheckingAccount(String personName) {
        this(personName, 0.0);
    }

    public CheckingAccount(String personName, double balance) {

        this.accountNumber = generateId();
        this.personName = personName;
        this.balance = balance;
    }

    private String generateId() {
        Random randomId = new Random();
        StringBuilder id = new StringBuilder();
        for (int i=0; i< 6; i++) {
            int digit = randomId.nextInt(10);
            id.append(digit);
        }
        return id.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public double getBalance() {
        return balance;
    }

    public void changeName(String newName) {
        this.personName = newName;
    }

    public void deposit(double newDeposit) {
        this.balance = balance + newDeposit;
    }

    public void withdraw(double newWithdraw) {
        this.balance = balance - newWithdraw;
    }

    public String getData() {
        String formattedBalance = toDecimal.format(balance);
        return "\nDados da conta: "
                + "\n Número da conta: " + accountNumber +
                "\n Nome do cliente: " + personName
                + "\n Saldo: "
                + "R$ "
                + formattedBalance;
    }
}
