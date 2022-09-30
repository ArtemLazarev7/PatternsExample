package generativePatterns.abstractFactory.collection_of_stories;

import generativePatterns.abstractFactory.Publisher;

public class PublisherURSS implements Publisher {
    @Override
    public void toPublish() {
        System.out.println("URSS publishers publishes a book");
    }
}
