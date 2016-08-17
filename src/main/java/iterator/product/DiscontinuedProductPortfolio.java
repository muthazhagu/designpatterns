package main.java.iterator.product;

/**
 * Created by muthu on 8/13/16.
 */
public class DiscontinuedProductPortfolio implements AbstractCollection{
    private Product[] products;

    public DiscontinuedProductPortfolio(Product[] p){
        products = p;
    }

    public AbstractIterator createIterator() {
        return new FailFastIterator(products);
    }
}
