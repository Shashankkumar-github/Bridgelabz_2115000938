public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Rocky", 2),
            new Cat("Kitty", 2),
            new Bird("Coco", 1)
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name +" is of "+ age +"years and "+ " barks");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name +" is of "+ age +"years and "+ " meows");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name +" is of "+ age +"years and "+ " chirps");
    }
}

