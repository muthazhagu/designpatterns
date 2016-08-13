package main.java.iterator;

/**
 * Created by muthu on 8/13/16.
 */
public class Client {
    public static void exerciseIterator(AbstractCollection abstractCollection){
        AbstractIterator abstractIterator = abstractCollection.createIterator();
        Object object = abstractIterator.getNext();

        while(object != null){
            System.out.println(object);
            object = abstractIterator.getNext();
        }
    }

    public static void main(String[] args){
        System.out.println("No product.");
        exerciseIterator(new ProductPortfolio(new Product[]{}));
        System.out.println();

        System.out.println("One product.");
        exerciseIterator(new ProductPortfolio(new Product[]{new Product()}));
        System.out.println();

        System.out.println("Two products.");
        exerciseIterator(new ProductPortfolio(new Product[]{new Product(), new Product()}));
        System.out.println();

        System.out.println("No discontinued product.");
        exerciseIterator(new DiscontinuedProductPortfolio(new Product[]{}));
        System.out.println();

        System.out.println("One discontinued product.");
        exerciseIterator(new DiscontinuedProductPortfolio(new Product[]{new Product()}));
        System.out.println();

        System.out.println("Two discontinued products.");
        exerciseIterator(new DiscontinuedProductPortfolio(new Product[]{new Product(), new Product()}));
        System.out.println();
    }
}
