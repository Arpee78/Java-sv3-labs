package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {

        for (int[] i : a) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] array = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        arrayOfArrays.printArrayOfArrays(array);
    }

}
