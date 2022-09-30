package behaviorPatterns.mediator;

public class ChatRunner {
    public static void main(String[] args) {
        TestChat chat=new TestChat();
        User admin=new Teacher(chat,"Teacher");
        User student1=new Student(chat,"Mike");
        User student2=new Student(chat,"Katy");

        chat.setAdmin(admin);
        chat.addUserToChat(student1);
        chat.addUserToChat(student2);
        student1.sendMessage("Hello I am student");
        student2.sendMessage("Hello I am student");
        admin.sendMessage("Roger that. I am teacher");
    }
}
