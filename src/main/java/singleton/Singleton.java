package main.java.singleton;

/**
 * Created by mpalanisamy on 8/11/16.
 */
public class Singleton {
    private static Singleton instance = null;

    protected Singleton(){}

    public synchronized static Singleton getInstance(){
        if (instance == null){
            System.out.println("instance is null. So creating this singleton for the first time.");
            instance = new Singleton();
        } else {
            System.out.println("instance is NOT null. So returning a pre-created instance.");
        }
        return instance;
    }

    public static void main(String[] args){
        Singleton mySingleton = Singleton.getInstance();
        Singleton myOtherSingleton = Singleton.getInstance();
    }
}
