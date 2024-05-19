package arrayofarrays;

public class DailyValues {

    public int[][] getValues() {
        int[][] result = new int[12][];
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[months[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        int[][] values = dailyValues.getValues();

        for (int[] i : values) {
            System.out.print(i.length + " ");
        }
    }
}
