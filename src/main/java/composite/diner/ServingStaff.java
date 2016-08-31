package main.java.composite.diner;

import java.util.Iterator;

/**
 * Created by mpalanisamy on 8/30/16.
 */
public class ServingStaff {

    private MenuComponent menuComponent;

    public ServingStaff(MenuComponent allMenus) {
        menuComponent = allMenus;
    }

    public void printMenu() {
        menuComponent.print();
    }

    public void printVeggieMenu() {
        Iterator<MenuComponent> iterator = menuComponent.createIterator();

        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();

            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
