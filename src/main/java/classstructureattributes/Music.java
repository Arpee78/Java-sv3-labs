package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a kedvenc zeneszámod adatait!");

        Song song = new Song();

        System.out.print("Együttes vagy előadó neve: ");
        song.band = scanner.nextLine();

        System.out.print("Zeneszám címe: ");
        song.title = scanner.nextLine();

        System.out.print("Zeneszám hossza: ");
        song.length = scanner.nextInt();
        scanner.nextLine();

        System.out.println(song.band + " – " + song.title + " (" + song.length +" perc)");

    }
}
