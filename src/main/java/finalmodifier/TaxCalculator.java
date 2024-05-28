package finalmodifier;

public class TaxCalculator {

    public static final int VAT = 27;

    public double tax(double price) {
        return price * 27 / 100.0;
    }

    public double priceWithTax(double price) {
        return price * (100 + 27) / 100.0;
    }
}
