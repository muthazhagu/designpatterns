package main.java.iterator.diner;

import java.util.Iterator;

/**
 * Created by muthu on 8/13/16.
 */
public class DinerMenuIterator implements java.util.Iterator {
    private MenuItem[] menuItems;
    int currentPosition = -1;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext(){
        return (menuItems.length != 0) && (currentPosition+1 < menuItems.length);
    }

    public Object next(){
        currentPosition += 1;
        if (currentPosition >= menuItems.length) {
            return null;
        } else {
            return menuItems[currentPosition];
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
