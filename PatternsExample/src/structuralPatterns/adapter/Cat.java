package structuralPatterns.adapter;

public class Cat implements Animals {

    @Override
    public void say() {
        System.out.println("Cat says meow-meow");
    }

    @Override
    public void walk() {
        System.out.println("Cat walking");

    }
}
