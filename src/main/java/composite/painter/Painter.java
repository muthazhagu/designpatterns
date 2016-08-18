package main.java.composite.painter;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class Painter implements PainterInterface {
    private int daysPerHouse;

    public Painter(int daysPerHouse) {
        this.daysPerHouse = daysPerHouse;
    }

    public float estimateDaysToPaint(int numberOfHouses) {
        return numberOfHouses * daysPerHouse;
    }
}
