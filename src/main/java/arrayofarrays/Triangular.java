package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(int size) {
        int[][] triangular = new int[size][];

        for (int i = 0; i < size; i++) {
            triangular[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangular[i][j] = i;
            }
        }
        return triangular;
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        int[][] array = triangular.triangularMatrix(8);
        for (int[] i : array) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }


}
