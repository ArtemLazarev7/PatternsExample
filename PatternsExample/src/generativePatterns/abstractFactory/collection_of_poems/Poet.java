package generativePatterns.abstractFactory.collection_of_poems;

import generativePatterns.abstractFactory.Composer;

public class Poet implements Composer {
    @Override
    public void toWrite() {
        System.out.println("The poet writes poetry");
    }
}
