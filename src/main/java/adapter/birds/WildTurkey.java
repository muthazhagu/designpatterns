package main.java.adapter.birds;

/**
 * Created by muthu on 9/4/16.
 */
public class WildTurkey implements Turkey {
    public void gobble(){
        System.out.println("Gobble Gobble Gobble!");
    }
    public void fly() {
        System.out.println("WildTurkey fly!");
    }
}
