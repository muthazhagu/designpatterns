package main.java.adapter.birds;

/**
 * Created by muthu on 9/4/16.
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck d) {
        duck = d;
    }

    public void fly() {
        duck.fly();
    }

    public void gobble() {
        duck.quack();
    }
}
