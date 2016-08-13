package main.java.iterator;

/**
 * Created by mpalanisamy on 8/11/16.
 */
public class Iterator implements AbstractIterator{
    private int currentIndex = -1;
    private int length = 0;
    private Product[] p;

    public Iterator(Product[] p){
        this.p = p;
        length = p.length;
    }

    public Product getNext(){
        if (length == 0){
            return null;
        }

        currentIndex += 1;
        if (currentIndex < length){
            return p[currentIndex];
        } else{
            return null;
        }
    }

    public static void main(String[] args){
        Iterator myIterator = new Iterator(new Product[] {});

        System.out.println(myIterator.getNext());
        System.out.println();

        myIterator = new Iterator(new Product[] {new Product()});

        System.out.println(myIterator.getNext());
        System.out.println();

        myIterator = new Iterator(new Product[] {new Product()});

        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println();

        myIterator = new Iterator(new Product[] {new Product(), new Product()});

        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());
        System.out.println(myIterator.getNext());

        System.out.println();
    }
}
