package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(10.45, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int partOfDouble = (int) distance.getDistanceInKm();
        System.out.println(partOfDouble);
    }

}
