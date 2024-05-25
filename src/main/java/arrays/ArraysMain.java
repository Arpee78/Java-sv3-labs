package arrays;

import java.util.Arrays;

import static java.lang.Math.min;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int length = min(day.length, anotherDay.length);
        double[] dayCopy = Arrays.copyOf(day, length);
        double[] anotherDayCopy = Arrays.copyOf(anotherDay, length);
        return Arrays.equals(dayCopy, anotherDayCopy);
    }

    public boolean wonLottery(int[] numbers1, int[] numbers2) {
        int[] numbers1Copy = Arrays.copyOf(numbers1, numbers1.length);
        int[] numbers2Copy = Arrays.copyOf(numbers2, numbers2.length);
        Arrays.sort(numbers1Copy);
        Arrays.sort(numbers2Copy);
        return Arrays.equals(numbers1Copy, numbers2Copy);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println("multiplicationTableAsString");
        System.out.println(arraysMain.multiplicationTableAsString(10));

        System.out.println("sameTempValues");
        System.out.println(arraysMain.sameTempValues(new double[]{1, 2, 3}, new double[]{1, 2, 3}));
        System.out.println(arraysMain.sameTempValues(new double[]{1, 2, 3}, new double[]{2, 2, 3}));

        System.out.println("sameTempValuesDaylight");
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1, 2}, new double[]{1, 2, 3}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1, 3}, new double[]{1, 2, 3}));

        System.out.println("wonLottery");
        int[] winner = new int[]{1, 2, 3, 4, 5};
        int[] stake = new int[]{5, 4, 3, 2, 1};
        System.out.println(arraysMain.wonLottery(winner, stake));
        System.out.println(Arrays.toString(winner));
        System.out.println(Arrays.toString(stake));
        System.out.println(arraysMain.wonLottery(new int[]{1, 2, 3}, new int[]{1, 2, 2}));
    }

}
