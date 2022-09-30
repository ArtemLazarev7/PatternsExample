package behaviorPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class TestChat implements Chat{
    User teacher;
    List<User> users=new ArrayList<>();

    public void setAdmin(User teacher) {
        this.teacher= teacher;
    }
    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user1 : users) {
            if(user1!=user){
                user1.getMessage(message);
            }
        }
        teacher.getMessage(message);
    }
}
