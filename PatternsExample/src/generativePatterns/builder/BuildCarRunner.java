package generativePatterns.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Builder builder=new Builder();

        builder.setCarBuilder(new CarNissan());
        Car car=builder.buildCar();
        System.out.println(car);
    }
}
