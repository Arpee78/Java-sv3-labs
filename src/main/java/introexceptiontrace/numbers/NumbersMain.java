package introexceptiontrace.numbers;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {
        Change change = new Change();
        System.out.println(Arrays.toString(change.changeNumbers()));
    }

    // A RandomOperations osztály 13. sorában keletkezik a kivétel.
    // Az indexelés volt elrontva a for ciklus fejlécében.
}
