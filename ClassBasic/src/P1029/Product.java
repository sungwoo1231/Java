package P1029;

public class Product {
    String productId;
    String name;
    double price;
    int stock;

    public Product(String productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }



public double setPrice(double newPrice) {
    this.price = newPrice;
    return this.price;
}
public int setStock(int newStock){
    this.stock = newStock;
    return this.stock;
}
}

