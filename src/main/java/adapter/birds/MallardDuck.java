package main.java.adapter.birds;

/**
 * Created by muthu on 9/4/16.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Mallard quack!");
    }
    public void fly() {
        System.out.println("Mallard fly!");
    }
}
