package generativePatterns.abstractFactory.collection_of_stories;

import generativePatterns.abstractFactory.Composer;
import generativePatterns.abstractFactory.Designer;
import generativePatterns.abstractFactory.ProjectTeamFactory;
import generativePatterns.abstractFactory.Publisher;

public class StoriesTeamFactory implements ProjectTeamFactory {
    @Override
    public Composer getComposer() {
        return new Writer();
    }

    @Override
    public Designer getDesigner() {
        return new DesignerMike();
    }

    @Override
    public Publisher getPublisher() {
        return new PublisherURSS();
    }
}
