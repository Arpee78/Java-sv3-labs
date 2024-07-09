package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két számot!");

        System.out.print("Első szám: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Második szám: ");
        String secondNumber = scanner.nextLine();

        System.out.println("Milyen műveletet végeznél rajtuk? +(összeadás), -(kivonás), *(szorzás), /(osztás)");
        String operation = scanner.nextLine();

        try {
            int result = new Calculator().calculate(firstNumber, secondNumber, operation);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
