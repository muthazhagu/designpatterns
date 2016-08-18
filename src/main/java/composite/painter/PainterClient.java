package main.java.composite.painter;

import java.util.ArrayList;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class PainterClient {
    public static void main(String[] args) {
        System.out.println("Individual painter servicing a landlord.");
        Painter painter = new Painter(3);
        LandLord landLord = new LandLord(1, painter);
        landLord.manageHouses();
        System.out.println();

        System.out.println("Painting company servicing a landlord.");
        Painter painter1 = new Painter(1);
        Painter painter2 = new Painter(1);
        Painter painter3 = new Painter(1);
        Painter painter4 = new Painter(1);
        ArrayList<Painter> painters = new ArrayList<>();
        painters.add(painter1);
        painters.add(painter2);
        painters.add(painter3);
        painters.add(painter4);
        PaintingCompany paintingCompany = new PaintingCompany(painters);
        LandLord landLord1 = new LandLord(1, paintingCompany);
        landLord1.manageHouses();
    }
}
