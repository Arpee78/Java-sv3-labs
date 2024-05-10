package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az 1. termék nevét: ");
        String name1 = scanner.nextLine();

        System.out.print("Add meg az 1. termék árát: ");
        int price1 = scanner.nextInt();
        scanner.nextLine();

        Product product1 = new Product(name1, price1);

        System.out.print("Add meg az 2. termék nevét: ");
        String name2 = scanner.nextLine();

        System.out.print("Add meg az 2. termék árát: ");
        int price2 = scanner.nextInt();
        scanner.nextLine();

        Product product2 = new Product(name2, price2);

        System.out.println("Termék1: " + product1.getName() + " " + product1.getPrice() + " Ft");
        System.out.println("Termék2: " + product2.getName() + " " + product2.getPrice() + " Ft");

        System.out.print("Mennyivel növeljük az 1. termék árát? ");
        int incValue1 = scanner.nextInt();
        scanner.nextLine();
        product1.increasePrice(incValue1);

        System.out.println("Termék1 a növelt árral: " + product1.getName() + " " + product1.getPrice() + " Ft");

        System.out.print("Mennyivel csökkentsük a 2. termék árát? ");
        int decValue2 = scanner.nextInt();
        scanner.nextLine();
        product2.decreasePrice(decValue2);

        System.out.println("Termék2 a csökkentett árral: " + product2.getName() + " " + product2.getPrice() + " Ft");


    }
}
