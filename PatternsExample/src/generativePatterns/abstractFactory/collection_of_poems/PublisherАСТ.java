package generativePatterns.abstractFactory.collection_of_poems;

import generativePatterns.abstractFactory.Publisher;

public class PublisherАСТ implements Publisher {
    @Override
    public void toPublish() {
        System.out.println("AST publishers publishes a book");
    }
}
