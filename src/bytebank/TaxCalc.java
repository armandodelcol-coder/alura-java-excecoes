package bytebank;

public abstract class TaxCalc {

    private static double total;

    public static void sumInTax(Taxable taxable) {
        TaxCalc.total += taxable.getTaxValue();
    }

    public static double getTotal() {
        return total;
    }
}
