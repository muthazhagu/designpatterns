package main.java.composite.painter;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class LandLord {
    private int numberOfHouses;
    private PainterInterface painterInterface;

    public LandLord(int numberOfHouses, PainterInterface painterInterface) {
        this.numberOfHouses = numberOfHouses;
        this.painterInterface = painterInterface;
    }

    public void ManageHouses() {
        System.out.println("Number of days to paint houses: " + painterInterface.estimateDaysToPaint(numberOfHouses));
    }
}
