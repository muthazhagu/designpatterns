package main.java.adapter.birds;

/**
 * Created by muthu on 9/4/16.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey t) {
        turkey = t;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
