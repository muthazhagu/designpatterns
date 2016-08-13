package main.java.iterator;

/**
 * Created by muthu on 8/13/16.
 */
public class FailFastIterator implements AbstractIterator{
    private Product[] p;
    private int currentIndex = -1;
    private int originalLength = 0;

    public FailFastIterator(Product[] p){
        this.p = p;
        originalLength = p.length;
    }

    public Object getNext(){
        currentIndex += 1;

        if (p.length == 0 || currentIndex >= p.length){
            return null;
        } else if (p.length > originalLength){
            throw new RuntimeException();
        } else{
            return p[currentIndex];
        }
    }

    public static void main(String[] args){
        FailFastIterator failFastIterator = new FailFastIterator(new Product[]{});
        System.out.println(failFastIterator.getNext());
        System.out.println();

        failFastIterator = new FailFastIterator(new Product[]{new Product()});
        System.out.println(failFastIterator.getNext());
        System.out.println(failFastIterator.getNext());
        System.out.println();

        failFastIterator = new FailFastIterator(new Product[]{new Product(), new Product()});
        System.out.println(failFastIterator.getNext());
        System.out.println(failFastIterator.getNext());
        System.out.println(failFastIterator.getNext());
        System.out.println();
    }
}
