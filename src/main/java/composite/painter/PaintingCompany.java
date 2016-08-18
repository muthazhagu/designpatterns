package main.java.composite.painter;

import java.util.ArrayList;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class PaintingCompany implements PainterInterface {
    private ArrayList<Painter> painters = new ArrayList<>();

    public PaintingCompany(ArrayList<Painter> painters) {
        this.painters = painters;
    }

    public float getPainterCapacity() {
        float painterCapacity = 0;
        for (Painter painter: painters) {
            painterCapacity += painter.estimateDaysToPaint(1);
        }
        return painterCapacity;
    }

    public float daysToPaintOneHouse() {
        return 1 / getPainterCapacity();
    }

    public float estimateDaysToPaint(int numberOfHouses) {
        return numberOfHouses * daysToPaintOneHouse();
    }
}
