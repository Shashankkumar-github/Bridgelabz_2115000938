import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; 
	
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

   
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
	
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String productName = scn.nextLine();

        System.out.print("Enter Product Price: ");
        double price = scn.nextDouble();

        Product product1 = new Product(productName, price);
        product1.displayProductDetails();
        Product.displayTotalProducts();
    }
}
