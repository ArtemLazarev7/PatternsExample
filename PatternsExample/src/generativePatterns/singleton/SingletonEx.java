package generativePatterns.singleton;

public class SingletonEx {
    private static SingletonEx singletonEx;

    private SingletonEx(){}

    public static synchronized SingletonEx createInstance(){
        if(singletonEx==null){
            return  singletonEx=new SingletonEx();
        }else
            return singletonEx;

    }
}
