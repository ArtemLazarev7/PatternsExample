package generativePatterns.prototype;

public class Test {
    public static void main(String[] args) {
        Sheep sheep=new Sheep(1,"Dolly","White");
        System.out.println(sheep);

        SheepLaboratory laboratory=new SheepLaboratory(sheep);
        Sheep dolly=laboratory.cloneSheep();
        System.out.println(dolly);
    }
}
