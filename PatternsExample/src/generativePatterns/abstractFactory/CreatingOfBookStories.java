package generativePatterns.abstractFactory;

import generativePatterns.abstractFactory.collection_of_stories.StoriesTeamFactory;

public class CreatingOfBookStories {
    public static void main(String[] args) {


        ProjectTeamFactory projectTeamFactory = new StoriesTeamFactory();
        Composer composer = projectTeamFactory.getComposer();
        Designer designer = projectTeamFactory.getDesigner();
        Publisher publisher = projectTeamFactory.getPublisher();

        System.out.println("The book is creating ...");
        composer.toWrite();
        designer.toDesign();
        publisher.toPublish();
    }
}