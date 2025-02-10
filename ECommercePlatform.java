
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public void displayProduct() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: $" + price);
    }
}


interface Taxable {
    double calculateTax();
    String getTaxDetails();
}


class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18;  
    private static final double DISCOUNT = 0.10;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}


class Clothing extends Product {
    private static final double DISCOUNT = 0.15; 

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT;
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0; 
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product electronics = new Electronics(201, "Laptop", 800);
        Product clothing = new Clothing(202, "T-Shirt", 50);
        Product groceries = new Groceries(203, "Apples", 10);

        Product[] products = {electronics, clothing, groceries};
		
        for (Product product : products) {
            product.displayProduct();
            System.out.println("Discount: $" + product.calculateDiscount());

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                System.out.println("Tax: $" + taxableProduct.calculateTax());
                System.out.println(taxableProduct.getTaxDetails());
            }

            double finalPrice = product.getPrice() + 
                               ((product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0) 
                               - product.calculateDiscount();
            System.out.println("Final Price after tax & discount: $" + finalPrice);
        }
    }
}
