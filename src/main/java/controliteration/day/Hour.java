package controliteration.day;

public class Hour {

    private int hourNumber;
    private DayPeriod period;

    public Hour(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public int getHourNumber() {
        return hourNumber;
    }

    public void setHourNumber(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public DayPeriod getPeriod() {
        return period;
    }

    public void setPeriod(DayPeriod period) {
        this.period = period;
    }


}
