package bytebank;

public class LifeInsurance extends Account implements Taxable {

    public LifeInsurance(int agency, int number, Client titular) {
        super(agency, number, titular);
    }

    @Override
    public double getTaxValue() {
        return 142;
    }

}
