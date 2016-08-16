package main.java.iterator.diner;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by muthu on 8/13/16.
 */
public class ServingStaff {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerHouseMenu dinerHouseMenu;

    public void printMenu(){
        java.util.Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        java.util.Iterator dinerHouseMenuItemsIterator = dinerHouseMenu.createIterator();

        System.out.println("Diner House Menu");
        printMenu(dinerHouseMenuItemsIterator);
        System.out.println();
        System.out.println("Pancake House Menu");
        printMenu(pancakeHouseMenuIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public ServingStaff(PancakeHouseMenu p, DinerHouseMenu d) {
        pancakeHouseMenu = p;
        dinerHouseMenu = d;
    }

    public static void main(String[] args){
        PancakeHouseMenu p = new PancakeHouseMenu();
        DinerHouseMenu d = new DinerHouseMenu();
        ServingStaff servingStaff = new ServingStaff(p, d);
        servingStaff.printMenu();
    }
}
