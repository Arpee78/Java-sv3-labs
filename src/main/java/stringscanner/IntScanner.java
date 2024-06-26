package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints);
        scanner.useDelimiter(";");

        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextInt()) {
            int actual = scanner.nextInt();
            if (actual > 100) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(actual);
            }
        }

        return sb.toString();
    }

}
