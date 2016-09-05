package main.java.adapter.enumiterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by muthu on 9/4/16.
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration e) {
        enumeration = e;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
