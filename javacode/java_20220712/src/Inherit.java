public class Inherit {
    public static void main(String[] args) {
        Animal animal = new Animal("animal...");
        animal.eat();
        Bird bird = new Bird("bird...");
        bird.fly();
    }
}

class Animal {
    public String name;
    public Animal (String name){
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "Bird::fly()");
    }
}

