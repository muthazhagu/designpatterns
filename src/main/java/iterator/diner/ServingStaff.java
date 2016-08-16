package main.java.iterator.diner;

import java.util.ArrayList;

/**
 * Created by muthu on 8/13/16.
 */
public class ServingStaff {
    private PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    private Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();

    private DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
    private Iterator dinerHouseMenuItemsIterator = dinerHouseMenu.createIterator();

    public void printMenu(){
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

    public static void main(String[] args){
        ServingStaff servingStaff = new ServingStaff();
        servingStaff.printMenu();
    }
}
