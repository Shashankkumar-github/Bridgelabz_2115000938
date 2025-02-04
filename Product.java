class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
	
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Smart Phone", 100000, 2);
        prod1.displayDetails();

        Product.updateDiscount(15.0);
        prod1.displayDetails();
    }
}
