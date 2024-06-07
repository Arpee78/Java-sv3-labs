package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(Integer.toString(5, 2));
        System.out.println(operators.isEven(3));
        System.out.println(operators.isEven(4));
        System.out.println(operators.getResultOfDivision(16,3));
        System.out.println(operators.isNull("szöveg"));
        System.out.println(operators.isNull(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty("szöveg"));
    }
}
