package main.java.iterator.product;

/**
 * Created by mpalanisamy on 8/11/16.
 */
public class ProductPortfolio implements AbstractCollection{
    private Product[] products;

    public ProductPortfolio(Product[] p){
        products = p;
    }

    public AbstractIterator createIterator(){
        return new Iterator(products);
    }

    public static void main(String[] args){
        ProductPortfolio myProductPortfolio = new ProductPortfolio(new Product[]{});
        Iterator myIterator = (Iterator)myProductPortfolio.createIterator();
        System.out.println(myIterator.getNext());
        System.out.println();

        myProductPortfolio = new ProductPortfolio(new Product[]{new Product()});
        myIterator = (Iterator)myProductPortfolio.createIterator();
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println();

        myProductPortfolio = new ProductPortfolio(new Product[]{new Product(), new Product()});
        myIterator = (Iterator)myProductPortfolio.createIterator();
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println();
    }
}
