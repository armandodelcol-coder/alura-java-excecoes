package bytebank;

import bytebank.exceptions.WithDrawZeroException;

public class TrainingExceptions {

    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount(1, 123, new Client("Armando Tadeu", "01020305-55", "Developer"));

        currentAccount1.deposit(10);
        currentAccount1.withDraw(0);

        SavingsAccount savingsAccount1 = new SavingsAccount(1, 123, new Client("Armando Tadeu", "01020305-55", "Developer"));
        try {
            savingsAccount1.withDraw(0);
        } catch (WithDrawZeroException ex) {
            System.out.println("Apenas saque um valor maior que zero.");
        }
    }

}
