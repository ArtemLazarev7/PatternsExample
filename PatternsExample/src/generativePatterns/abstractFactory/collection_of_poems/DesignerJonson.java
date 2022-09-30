package generativePatterns.abstractFactory.collection_of_poems;

import generativePatterns.abstractFactory.Designer;

public class DesignerJonson implements Designer {
    @Override
    public void toDesign() {
        System.out.println("Designer Johnson designs");
    }
}
