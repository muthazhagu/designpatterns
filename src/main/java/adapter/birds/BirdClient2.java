package main.java.adapter.birds;

/**
 * Created by muthu on 9/4/16.
 */
public class BirdClient2 {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Turkey turkey = new DuckAdapter(mallardDuck);

        mallardDuck.fly();
        mallardDuck.quack();

        wildTurkey.fly();
        wildTurkey.gobble();

        turkey.fly();
        turkey.gobble();
    }
}
