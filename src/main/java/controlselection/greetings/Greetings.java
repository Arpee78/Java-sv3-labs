package controlselection.greetings;

public class Greetings {

    public static final int MINUTES = 60;

    public String greet(int hour, int minute) {

        int inMinutes = hour * MINUTES + minute;

        int five = 5 * MINUTES;
        int nine = 9 * MINUTES;
        int eighteenThirty = 18 * MINUTES + 30;
        int twenty = 20 * MINUTES;

        if (inMinutes <= five || inMinutes > twenty) {
            return "jó éjt";
        } else if (inMinutes > five && inMinutes <= nine) {
            return "jó reggelt";
        } else if (inMinutes > nine && inMinutes <= eighteenThirty) {
            return "jó napot";
        } else {
            return "jó estét";
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greet(20, 1));
    }
}
