package structuralPatterns.adapter;

public class AdapterDuckToCat extends Duck implements Animals{
    @Override
    public void walk() {
        fly();
    }
}
