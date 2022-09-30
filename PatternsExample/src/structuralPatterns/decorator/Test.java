package structuralPatterns.decorator;

public class Test {
    public static void main(String[] args) {
        Shop gift=new TeddyBear(new ToyCar(new TeddyBear(new GiftWrapping())));
        System.out.println(gift.cost());
    }
}
