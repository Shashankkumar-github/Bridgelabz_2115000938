public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2024-02-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2024-02-02", "TRK56789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2024-02-03", "TRK98765", "2024-02-05");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", Shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", Delivered on " + deliveryDate;
    }
}


