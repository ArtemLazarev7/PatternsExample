package generativePatterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonEx singletonEx1=SingletonEx.createInstance();
        SingletonEx singletonEx2=SingletonEx.createInstance();
        SingletonEx singletonEx3=SingletonEx.createInstance();
        System.out.println(singletonEx1.toString());
        System.out.println(singletonEx2.toString());
        System.out.println(singletonEx3.toString());
    }
}
