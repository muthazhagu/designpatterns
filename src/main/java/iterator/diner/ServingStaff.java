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

    public void printPancakeHouseMenu(){
        while (pancakeHouseMenuIterator.hasNext()) {
            System.out.println(pancakeHouseMenuIterator.next());
        }
    }

    public void printDinerHouseMenu(){
        while (dinerHouseMenuItemsIterator.hasNext()) {
            System.out.println(dinerHouseMenuItemsIterator.next());
        }
    }

    public static void main(String[] args){
        ServingStaff servingStaff = new ServingStaff();
        System.out.println("Diner House Menu");
        servingStaff.printDinerHouseMenu();
        System.out.println();
        System.out.println("Pancake House Menu");
        servingStaff.printPancakeHouseMenu();
    }
}
