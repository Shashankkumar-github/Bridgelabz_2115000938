
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }
}


class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private static final double Additional_charge = 20; 

    public NonVegItem(String itemName,double price,int quantity) {
        super(itemName,price,quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return (getPrice()+Additional_charge)*getQuantity();
    }
}


interface Discountable {
    double applyDiscount();
}


public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegBurger = new VegItem("Veg Burger", 5.0, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 8.0, 1);

        vegBurger.getItemDetails();
        System.out.println("Total Price: $" + vegBurger.calculateTotalPrice());

        chickenPizza.getItemDetails();
        System.out.println("Total Price: $" + chickenPizza.calculateTotalPrice());
    }
}
