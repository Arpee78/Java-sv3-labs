package introexceptiontrycatchtrace;

public class Calculator {

    public Integer calculate(String firstNumber, String secondNumber, String operation) {
        int n1 = Integer.parseInt(firstNumber);
        int n2 = Integer.parseInt(secondNumber);
        if ("+".equals(operation)) {
            return n1 + n2;
        }

        if ("-".equals(operation)) {
            return n1 - n2;
        }

        if ("*".equals(operation)) {
            return n1 * n2;
        }

        if ("/".equals(operation)) {
            return n1 / n2;
        }
        return null;
    }
}
