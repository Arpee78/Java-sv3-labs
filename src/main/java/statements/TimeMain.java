package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        System.out.println("Adj meg két időpontot.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. időpont óra: ");
        int time1Hour = scanner.nextInt();

        System.out.print("1. időpont perc: ");
        int time1Minute = scanner.nextInt();

        System.out.print("1. időpont másodperc: ");
        int time1Second = scanner.nextInt();

        System.out.print("2. időpont óra: ");
        int time2Hour = scanner.nextInt();

        System.out.print("2. időpont perc: ");
        int time2Minute = scanner.nextInt();

        System.out.print("2. időpont másodperc: ");
        int time2Second = scanner.nextInt();

        Time time1 = new Time(time1Hour, time1Minute, time1Second);
        Time time2 = new Time(time2Hour, time2Minute, time2Second);

        System.out.println("Az első időpont " + time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));

    }
}
