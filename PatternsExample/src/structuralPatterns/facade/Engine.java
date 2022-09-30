package structuralPatterns.facade;

public class Engine {
    private boolean condition;

    public boolean isCondition(){
        return condition;
    }
    public void started(){
        System.out.println("The engine is running");
        condition=true;
    }
    public void stopped(){
        System.out.println("Engine is shut off");
    }
}
