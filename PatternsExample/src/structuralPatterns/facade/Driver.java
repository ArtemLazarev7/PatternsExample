package structuralPatterns.facade;

public class Driver {
    public void toDrive(Engine engine){
        if(engine.isCondition()){
            System.out.println("The driver drove.");
        }else{
            System.out.println("The driver wait");
        }
    }
}
