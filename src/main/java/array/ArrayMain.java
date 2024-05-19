package array;

public class ArrayMain {

    public static void main(String[] args) {
        String[] namesOfDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap" };
        System.out.println("namesOfDays második eleme: " + namesOfDays[1]);
        System.out.println("namesOfDays hossza: " + namesOfDays.length);

        int[] powersOfTwo = new int[5];

        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = 2 * powersOfTwo[i-1];
        }
        for (int actual: powersOfTwo){
            System.out.print(actual + " ");
        }

        boolean[] booleans = new boolean[6];

        for (int i = 1; i < booleans.length; i++) {
            booleans[i] = !booleans[i-1];
        }

        System.out.println();

        for (boolean actual: booleans){
            System.out.print(actual + " ");
        }
    }
}
