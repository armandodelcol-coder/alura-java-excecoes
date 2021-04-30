package bytebank;

public class TrainingTaxCalc {

    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount(
                1,
                21,
                new Client("Armando Tadeu", "010245045-22", "Developer")
        );
        currentAccount1.deposit(8100.0);

        LifeInsurance lifeInsurance1 = new LifeInsurance(
                1,
                21,
                new Client("Armando Tadeu", "010245045-22", "Developer")
        );


        TaxCalc.sumInTax(currentAccount1);
        TaxCalc.sumInTax(lifeInsurance1);
        System.out.println("Total de imposto a paga: " + TaxCalc.getTotal());
    }

}
