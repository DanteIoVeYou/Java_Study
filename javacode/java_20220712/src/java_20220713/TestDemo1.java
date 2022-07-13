package java_20220713;

class Animal {
    public String name;
    Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("animal::eat()");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("cat::eat()");
    }
    public void miao() {
        System.out.println("cat::mmmmmm");
    }
}
public class TestDemo1 {
    public static void func(Animal animal) {
        animal.eat();
    }

    public static void main1(String[] args) {
        //Animal animal = new Animal("aa");
        //Animal cat = new Cat("cc");
        //cat.eat();
        //Cat cat = new Cat("cc");
        Animal animal = new Cat("cc");
        func(animal);
    }

    public static void main(String[] args) {

    }
}
