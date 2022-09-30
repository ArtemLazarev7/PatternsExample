package generativePatterns.prototype;

public class SheepLaboratory {
    Sheep sheep;

    public SheepLaboratory(Sheep sheep) {
        this.sheep = sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }
    Sheep cloneSheep(){
        return (Sheep) sheep.copy();
    }
}
