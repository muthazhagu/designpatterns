package main.java.composite.diner;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by mpalanisamy on 8/30/16.
 */
public class CompositeIterator implements Iterator{
    private Stack<Iterator<MenuComponent>> iteratorStack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator iterator) {
        iteratorStack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (iteratorStack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = iteratorStack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                iteratorStack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = iteratorStack.peek();
            MenuComponent menuComponent = iterator.next();
            iteratorStack.push(menuComponent.createIterator());
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
