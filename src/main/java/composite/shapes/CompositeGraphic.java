package main.java.composite.shapes;

import java.util.ArrayList;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class CompositeGraphic implements Graphic {
    private ArrayList<Graphic> graphics = new ArrayList<Graphic>();

    public void print(){
        for (Graphic graphic: graphics) {
            graphic.print();
        }
    }

    public void addGraphic(Graphic graphic) {
        graphics.add(graphic);
    }

    public void removeGraphic(Graphic graphic) {
        graphics.remove(graphic);
    }
}
