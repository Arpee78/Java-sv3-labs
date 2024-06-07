package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {
        System.out.println("Pozíció: " + Position.CEO + ", fizetés: " +
                Position.CEO.getSalary() + " Ft, béren kívüli juttatás(ok): " +
                Position.CEO.getBenefit());
        System.out.println("Pozíció: " + Position.CFO + ", fizetés: " +
                Position.CFO.getSalary() + " Ft, béren kívüli juttatás(ok): " +
                Position.CFO.getBenefit());
    }
}
