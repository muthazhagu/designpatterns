package main.java.composite.shapes;

/**
 * Created by mpalanisamy on 8/17/16.
 */
public class CompositeClient {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic cg1 = new CompositeGraphic();
        CompositeGraphic cg2 = new CompositeGraphic();
        CompositeGraphic cg3 = new CompositeGraphic();

        cg1.addGraphic(ellipse1);
        cg1.addGraphic(ellipse2);

        cg2.addGraphic(ellipse3);
        cg2.addGraphic(ellipse4);

        cg3.addGraphic(cg1);
        cg3.addGraphic(cg2);

        cg3.print();
    }
}
