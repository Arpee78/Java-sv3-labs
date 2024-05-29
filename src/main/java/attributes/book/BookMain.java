package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Robinson Crusoe");
        System.out.println(book.getTitle());
        book.setTitle("Anna Frank naplója");
        System.out.println(book.getTitle());
    }
}
