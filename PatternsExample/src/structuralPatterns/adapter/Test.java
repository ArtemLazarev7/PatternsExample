package structuralPatterns.adapter;

public class Test {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.say();
        cat.walk();

        Animals duck=new AdapterDuckToCat();
        duck.say();
        duck.walk();



    }
}
