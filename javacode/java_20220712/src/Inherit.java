public class Inherit {
    public static void main(String[] args) {
        Animal animal = new Animal("a");
        animal.eat();
        Bird bird = new Bird("aa");
        bird.eat();
    }
}

class Animal {
    public String name;
    public Animal (String name){
        this.name = name;
    }
    public void eat() {
        System.out.println("Animal::eat()");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
}

