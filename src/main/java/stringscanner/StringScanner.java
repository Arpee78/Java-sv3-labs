package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj egy mondatot több tagmondattal, azaz tartalmazzon vesszőt.");
        String sentence = scanner.nextLine();

        Scanner s = new Scanner(sentence);

        while (s.hasNext()){
            System.out.println(s.next());
        }

        System.out.println();

        System.out.println("Írj egy újabb mondatot több tagmondattal, azaz tartalmazzon vesszőt.");
        sentence = scanner.nextLine();

        s = new Scanner(sentence);
        s.useDelimiter(",");
        while (s.hasNext()){
            System.out.println(s.next());
        }

    }
}
