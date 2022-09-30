package generativePatterns.abstractFactory.collection_of_poems;

import generativePatterns.abstractFactory.Composer;
import generativePatterns.abstractFactory.Designer;
import generativePatterns.abstractFactory.ProjectTeamFactory;
import generativePatterns.abstractFactory.Publisher;

public class PoemsTeamFactory implements ProjectTeamFactory {


    @Override
    public Composer getComposer() {
        return new Poet();
    }

    @Override
    public Designer getDesigner() {
        return new DesignerJonson();
    }

    @Override
    public Publisher getPublisher() {
        return new PublisherАСТ();
    }
}
