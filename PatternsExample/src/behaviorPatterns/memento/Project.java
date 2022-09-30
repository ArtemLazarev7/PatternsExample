package behaviorPatterns.memento;

import java.util.Date;

public class Project {
    private String version;
    public Date date;
    public void setVersionAndDate(String version){
        this.version=version;
        this.date=new Date();
    }
    public Save save(){
        return new Save(version);
    }
    public void load(Save save){
        version=save.getVersion();
        date=save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nversion='" + version + '\'' +
                "\ndate=" + date +
                '\n';
    }
}
