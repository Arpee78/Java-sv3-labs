package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store1 = new Store("telefon");
        Store store2 = new Store("számítógép");

        store1.addProduct(10);
        System.out.println(store1.getProduct());
        System.out.println(store1.getStock());
        store1.dispatch(5);
        System.out.println(store1.getStock());

        store2.addProduct(20);
        System.out.println(store2.getProduct());
        System.out.println(store2.getStock());
        store2.dispatch(3);
        System.out.println(store2.getStock());
    }


}
