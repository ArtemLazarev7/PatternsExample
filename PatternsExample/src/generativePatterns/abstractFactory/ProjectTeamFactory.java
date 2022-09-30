package generativePatterns.abstractFactory;

public interface ProjectTeamFactory {
    Composer getComposer();
    Designer getDesigner();
    Publisher getPublisher();
}
