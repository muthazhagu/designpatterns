package main.java.composite.diner;

import java.util.Iterator;

/**
 * Created by mpalanisamy on 8/30/16.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
