package main.java.iterator.diner;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by muthu on 8/13/16.
 */
public class ServingStaff {
    private Menu pancakeHouseMenu;
    private Menu dinerHouseMenu;
    private Menu cafeHouseMenu;

    public void printMenu(){
        java.util.Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        java.util.Iterator<MenuItem> dinerHouseMenuItemsIterator = dinerHouseMenu.createIterator();
        java.util.Iterator<MenuItem> cafeHouseMenuItemsIterator = cafeHouseMenu.createIterator();

        System.out.println("Diner House Menu");
        printMenu(dinerHouseMenuItemsIterator);
        System.out.println();
        System.out.println("Pancake House Menu");
        printMenu(pancakeHouseMenuIterator);
        System.out.println();
        System.out.println("Cafe House Menu");
        printMenu(cafeHouseMenuItemsIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public ServingStaff(Menu p, Menu d, Menu c) {
        pancakeHouseMenu = p;
        dinerHouseMenu = d;
        cafeHouseMenu = c;
    }

    public static void main(String[] args){
        PancakeHouseMenu p = new PancakeHouseMenu();
        DinerHouseMenu d = new DinerHouseMenu();
        CafeMenu c = new CafeMenu();
        ServingStaff servingStaff = new ServingStaff(p, d, c);
        servingStaff.printMenu();
    }
}
