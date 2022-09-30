package structuralPatterns.facade;

public class Test {
    public static void main(String[] args) {
        FacadeAction facadeAction=new FacadeAction();
        facadeAction.startDrive();
        facadeAction.stopDrive();
    }
}
