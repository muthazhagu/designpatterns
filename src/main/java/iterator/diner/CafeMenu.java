package main.java.iterator.diner;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by muthu on 8/16/16.
 */
public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("CH Pancake BrkFast",
                "Pancakes with egg and bacon",
                false,
                2.99);

        addItem("CH Pancake Regular",
                "Pancakes with egg and bacon, and toast",
                false,
                2.99);

        addItem("CH Waffles BrkFast",
                "Waffles with egg and bacon",
                false,
                3.49);

        addItem("CH Waffles Regular",
                "Waffles with egg and bacon, and toast",
                false,
                3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
