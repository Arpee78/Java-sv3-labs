package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Adj meg két számot, és az elvégzendő műveletet.");
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

        try{
            System.out.print("1. szám: ");
            number1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("2. szám: ");
            number2 = scanner.nextInt();
            scanner.nextLine();

        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }

        System.out.print("Művelet( + - * / ): ");
        String operation = scanner.nextLine();

        if ("+".equals(operation)){
            System.out.println(number1+number2);
        }

        if ("-".equals(operation)){
            System.out.println(number1-number2);
        }

        if ("*".equals(operation)){
            System.out.println(number1*number2);
        }

        if ("/".equals(operation)){
            try {
                System.out.println(number1/number2);
            } catch (ArithmeticException ae) {
                ae.printStackTrace();
            }
        }


    }
}
