
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Ramu", 202, 5);

      
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


interface Worker {
    void performDuties(); 
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing delicious " + specialty + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}


class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tablesAssigned + " tables.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
    }
}
