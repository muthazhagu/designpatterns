package main.java.iterator.diner;

import java.util.ArrayList;

/**
 * Created by muthu on 8/13/16.
 */
public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

        addItem("Pancake BrkFast",
                "Pancakes with egg and bacon",
                false,
                2.99);

        addItem("Pancake Regular",
                "Pancakes with egg and bacon, and toast",
                false,
                2.99);

        addItem("Waffles BrkFast",
                "Waffles with egg and bacon",
                false,
                3.49);

        addItem("Waffles Regular",
                "Waffles with egg and bacon, and toast",
                false,
                3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
