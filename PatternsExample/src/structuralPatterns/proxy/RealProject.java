package structuralPatterns.proxy;

public class RealProject implements Project{
    public String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from "+url+"...");
    }
    @Override
    public void run() {
        System.out.println("Running Project "+url+"...");
    }
}
