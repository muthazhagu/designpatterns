package main.java.adapter.birds;

/**
 * Created by muthu on 9/4/16.
 */
public class BirdClient {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);

        mallardDuck.fly();
        mallardDuck.quack();

        wildTurkey.fly();
        wildTurkey.gobble();

        duck.fly();
        duck.quack();
    }
}
