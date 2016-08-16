package main.java.iterator.diner;

import java.util.Iterator;

/**
 * Created by muthu on 8/15/16.
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
