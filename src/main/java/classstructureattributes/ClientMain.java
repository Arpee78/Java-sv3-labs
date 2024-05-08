package classstructureattributes;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a kliens nevét: ");
        client.name = scanner.nextLine();

        System.out.print("Add meg a kliens születési évét: ");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Add meg a kliens címét: ");
        client.address = scanner.nextLine();

        System.out.println("Név: " + client.name);
        System.out.println("Születési év: " + client.year);
        System.out.println("Cím: " + client.address);

    }

}
