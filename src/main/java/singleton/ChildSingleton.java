package main.java.singleton;

/**
 * Created by mpalanisamy on 8/11/16.
 */
public class ChildSingleton extends Singleton{
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        Singleton myOtherSingleton = Singleton.getInstance();
    }
}
