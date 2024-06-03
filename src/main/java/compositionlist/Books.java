package compositionlist;

import objects.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    private List<String> books = new ArrayList<>();

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String title) {
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int index = books.indexOf(title);
        if (index > -1) {
            books.set(index, author + ": " + title);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hány könyvcímet tárolnál? ");
        int number = scanner.nextInt();
        scanner.nextLine();

        Books books = new Books();

        for (int i = 0; i < number; i++) {
            System.out.print(i+1+". számú könyv: ");
            books.addBook(scanner.nextLine());
        }

        System.out.println("Adj meg szerzőt az egyik könyvhöz.");
        System.out.print("Könyv címe: ");
        String title = scanner.nextLine();
        System.out.print("Szerző: ");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(title, author);

        System.out.println(books.getBooks());
    }
}
