package main.java.iterator;

/**
 * Created by mpalanisamy on 8/11/16.
 */
public class ProductPortfolio {
    private Product[] products;

    public ProductPortfolio(Product[] p){
        products = p;
    }

    public Iterator createIterator(){
        return new Iterator(products);
    }

    public static void main(String[] args){
        ProductPortfolio myProductPortfolio = new ProductPortfolio(new Product[]{});
        Iterator myIterator = myProductPortfolio.createIterator();
        System.out.println(myIterator.getNext());
        System.out.println();

        myProductPortfolio = new ProductPortfolio(new Product[]{new Product()});
        myIterator = myProductPortfolio.createIterator();
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println();

        myProductPortfolio = new ProductPortfolio(new Product[]{new Product(), new Product()});
        myIterator = myProductPortfolio.createIterator();
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println();

    }
}
