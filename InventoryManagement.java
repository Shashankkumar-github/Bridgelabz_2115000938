class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head;

    public void addAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    public void addAtPosition(String name, int id, int quantity, double price, int position) {
        Item newItem = new Item(name, id, quantity, price);
        if (position == 1) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantity(int id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public Item searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }


    public double calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    public void sortByPrice() {
        head = mergeSort(head);
    }

    private Item mergeSort(Item head) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSort(head);
        Item right = mergeSort(nextOfMiddle);
        return merge(left, right);
    }

    private Item merge(Item left, Item right) {
        if (left == null) return right;
        if (right == null) return left;
        Item result;
        if (left.price <= right.price) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addAtEnd("Laptop", 101, 10, 50000);
        inventory.addAtEnd("Mouse", 102, 50, 500);
        inventory.addAtBeginning("Keyboard", 103, 30, 1000);
        inventory.addAtPosition("Monitor", 104, 20, 15000, 2);
        System.out.println("Inventory List:");
        inventory.displayInventory();
        inventory.updateQuantity(102, 60);
        System.out.println("Updated Inventory:");
        inventory.displayInventory();
        System.out.println("Total Inventory Value:" + inventory.calculateTotalValue());
        inventory.sortByPrice();
        System.out.println("Sorted by Price:");
        inventory.displayInventory();
    }
}
