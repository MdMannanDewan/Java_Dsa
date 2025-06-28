public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// base/parent class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathing");
    }
}

// derived/child class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swimming");
    }
}