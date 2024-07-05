package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a regisztrációs adatokat!");

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Film címe: ");
        String title = scanner.nextLine();

        System.out.print("Jegyek száma: ");
        int numberOfTickets = Integer.parseInt(scanner.nextLine());

        System.out.print("Melyik sorba kéri: ");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("Vásárló neve: " + name);
        System.out.println("Film címe: " + title);
        System.out.println("Lefoglalt helyek: " + new Cinema().makePlacesString(numberOfTickets, row));
    }

    private String makePlacesString(int numberOfTickets, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numberOfTickets; i++) {
            if (i > 1) {
                sb.append(", ");
            }
            sb.append(row + ". sor " + i + ". szék");
        }
        return sb.toString();
    }
}
