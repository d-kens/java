package inheritance_polymorphism;

/**
 * If a class is designed to be extended, it is better to provide a no-args constructor to avoid programming errors
 *
 * **/
public class Apple extends Fruit {
}

class Fruit {
    public Fruit() {}

    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}
