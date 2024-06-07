package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int count = 0;
        int direction = 0;
        for (int alteration = 10; direction < 360; alteration += 10) {
            direction += alteration;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(new HeadingNorth().getNumberOfNewDirections());
    }
}
