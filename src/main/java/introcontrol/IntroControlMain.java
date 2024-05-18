package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println("\nsubtractTenIfGreaterThanTen");
        System.out.println(introControl.subtractTenIfGreaterThanTen(8));
        System.out.println(introControl.subtractTenIfGreaterThanTen(12));

        System.out.println("\ndescribeNumber");
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(3));

        System.out.println("\ngreetingToJoe");
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jim"));

        System.out.println("\ncalculateBonus");
        System.out.println(introControl.calculateBonus(800_000));
        System.out.println(introControl.calculateBonus(1_200_000));

        System.out.println("\ncalculateConsumption");
        System.out.println(introControl.calculateConsumption(5000,6000));
        System.out.println(introControl.calculateConsumption(6000,5000));

        System.out.println("\nprintNumbers");
        introControl.printNumbers(5);

        System.out.println("\nprintNumbersBetween");
        introControl.printNumbersBetween(3,8);

        System.out.println("\nprintNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(3,8);
        introControl.printNumbersBetweenAnyDirection(8,3);

        System.out.println("\nprintOddNumbers");
        introControl.printOddNumbers(8);

    }
}
