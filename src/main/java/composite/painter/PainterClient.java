package main.java.composite.painter;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class PainterClient {
    public static void main(String[] args) {
        Painter painter = new Painter(3);
        LandLord landLord = new LandLord(5, painter);
        landLord.ManageHouses();
    }
}
