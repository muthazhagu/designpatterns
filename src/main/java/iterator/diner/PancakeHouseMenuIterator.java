package main.java.iterator.diner;

import java.util.ArrayList;

/**
 * Created by mpalanisamy on 8/15/16.
 */
public class PancakeHouseMenuIterator implements MenuIterator {
    private ArrayList<MenuItem> menuItems;
    private int currenPosition = -1;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return (menuItems.size() != 0) && (currenPosition+1 < menuItems.size());
    }

    public Object next() {
        if (menuItems.size() == 0) {
            return null;
        }

        currenPosition += 1;

        if (currenPosition >= menuItems.size()) {
            return null;
        } else {
            return menuItems.get(currenPosition);
        }
    }
}
