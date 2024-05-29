package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        days = days > 365 ? 365 : days;
        return fund * (interestRate / 100.0) * (days / 365.0);
    }

    public double close(int days) {
        double totalAmount = (fund + getYield(days)) * (1 - cost / 100);
        double payout = active ? totalAmount : 0;
        this.active = false;
        return payout;
    }

}
