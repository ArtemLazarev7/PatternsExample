package behaviorPatterns.iterator;

public class Test {
    public static void main(String[] args) {


        String[] modelCars = {"Nissan", "Bmw", "Opel", "MB", "Audi"};
        Cars cars = new Cars(modelCars);
        Iterator iterator = cars.getIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}