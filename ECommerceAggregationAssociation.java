public class ECommerceAggregationAssociation {
    public static void main(String[] args) {
        Customer customer = new Customer("Raj");
        Order order = new Order();
        order.addProduct(new Product("Laptop"));
        order.addProduct(new Product("Phone"));
        customer.placeOrder(order);
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order contains:");
        for (Product product : products) {
            System.out.println("   " + product.getName());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order.");
        order.displayOrder();
    }
}

