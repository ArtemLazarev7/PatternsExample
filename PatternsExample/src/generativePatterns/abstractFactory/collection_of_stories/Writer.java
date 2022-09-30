package generativePatterns.abstractFactory.collection_of_stories;

import generativePatterns.abstractFactory.Composer;

public class Writer implements Composer {
    @Override
    public void toWrite() {
        System.out.println("The writer writes stories");
    }
}
