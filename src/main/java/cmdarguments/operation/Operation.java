package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {

        for (String actual : args) {
            boolean list = actual.equals("/list");
            boolean add = actual.equals("/add");
            boolean delete = actual.equals("/delete");

            if (list) {
                System.out.println("Listázás");
            }
            if (add) {
                System.out.println("Hozzáadás");
            }
            if (delete){
                System.out.println("Törlés");
            }
            if (!(list || add || delete)) {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
