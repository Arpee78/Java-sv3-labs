package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void addProduct(int addCount) {
        stock = stock + addCount;
    }

    public void dispatch(int removeCount) {
        stock = stock - removeCount;
    }
}
