package algorithmssum;

public class TwoDigitOdds {

    public int getSum() {

        int sum = 0;

        for (int i = 11; i <= 99; i += 2) {
            if (i % 5 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
