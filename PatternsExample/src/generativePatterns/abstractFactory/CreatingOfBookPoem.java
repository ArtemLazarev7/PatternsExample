package generativePatterns.abstractFactory;

import generativePatterns.abstractFactory.collection_of_poems.PoemsTeamFactory;

public class CreatingOfBookPoem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new PoemsTeamFactory();
        Composer composer=projectTeamFactory.getComposer();
        Designer designer=projectTeamFactory.getDesigner();
        Publisher publisher= projectTeamFactory.getPublisher();

        System.out.println("The book is creating ...");
        composer.toWrite();
        designer.toDesign();
        publisher.toPublish();
    }
}
