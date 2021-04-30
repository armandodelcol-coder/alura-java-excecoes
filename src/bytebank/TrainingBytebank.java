package bytebank;

public class TrainingBytebank {

    public static void main(String[] args) {
        Client client1 = new Client("Armando Tadeu", "12345678", "Developer");
        Client client2 = new Client("Ana Claudia", "321456987", "clerk");

        SavingsAccount savingsAccount1 = new SavingsAccount(1, 812, client1);
        CurrentAccount currentAccount1 = new CurrentAccount(1, 812, client1);

        SavingsAccount savingsAccount2 = new SavingsAccount(1, 928, client2);
        CurrentAccount currentAccount2 = new CurrentAccount(1, 928, client2);

        savingsAccount1.deposit(1000);
        currentAccount1.deposit(810);

        savingsAccount2.deposit(10);
        currentAccount2.deposit(100);

        System.out.println("Cliente: " + client1.getName());
        System.out.println("  Saldo conta poupança = " + savingsAccount1.getBalance());
        System.out.println("  Saldo conta corrente = " + currentAccount1.getBalance());

        System.out.println("Cliente: " + client2.getName());
        System.out.println("  Saldo conta poupança = " + savingsAccount2.getBalance());
        System.out.println("  Saldo conta corrente = " + currentAccount2.getBalance());


        currentAccount1.transfer(200, savingsAccount2);
        System.out.println("Cliente: " + client1.getName());
        System.out.println("  Saldo conta poupança = " + savingsAccount1.getBalance());
        System.out.println("  Saldo conta corrente = " + currentAccount1.getBalance());

        System.out.println("Cliente: " + client2.getName());
        System.out.println("  Saldo conta poupança = " + savingsAccount2.getBalance());
        System.out.println("  Saldo conta corrente = " + currentAccount2.getBalance());

        System.out.println("Total de contas abertas: " + Account.getTotal());
    }

}
