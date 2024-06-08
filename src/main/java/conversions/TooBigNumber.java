package conversions;

public class TooBigNumber {

    public long getRightResult(int number) {
        return (long) number + 1;
    }

    public static void main(String[] args) {
        System.out.println(new TooBigNumber().getRightResult(2_147_483_647));
    }
}
