package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    private CircleCalculator circleCalculator = new CircleCalculator();

    public double calculateVolume(double r, double h) {
        return circleCalculator.calculateArea(r) * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        return circleCalculator.calculateArea(r) * 2 + circleCalculator.calculatePerimeter(r) * h;
    }
}
