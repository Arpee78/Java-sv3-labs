package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        System.out.print("Megoldás? 3 / 8 + 7 / (8 - 2) = ?  ");
        double solutionByUser = new Scanner(System.in).nextDouble();
        double solutionReal = 3.0 / 8 + 7.0 / (8 - 2);
        if (Math.abs(solutionByUser - solutionReal) < 0.0001) {
            System.out.println("A megoldásod helyes!");
        } else System.out.println("A megoldásod helytelen!");
    }
}
