package bytebank;

import bytebank.exceptions.BalanceInsufficientException;
import bytebank.exceptions.WithDrawZeroException;

public abstract class Account {

    private static int total = 0;
    private double balance;
    private int agency;
    private int number;
    private Client titular;

    public Account(int agency, int number, Client titular) {
        Account.total++;
        this.agency = agency;
        this.number = number;
        this.titular = titular;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withDraw(double value) {
        if (value <= 0) throw new WithDrawZeroException("Não é permitido sacar um valor 0.");

        if (value > this.balance) throw new BalanceInsufficientException("Saldo insuficiente.");

        this.balance -= value;
    }

    public void transfer(double value, Account toAccount) {
        withDraw(value);
        toAccount.deposit(value);
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotal() {
        return total;
    }

}
