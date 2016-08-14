package main.java.iterator.diner;

import java.util.ArrayList;

/**
 * Created by muthu on 8/13/16.
 */
public class ServingStaff {
    private PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    private ArrayList<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();

    private DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
    private Iterator dinerHouseMenuItemsIterator = dinerHouseMenu.createIterator();

    public void printPancakeHouseMenu(){
        for (MenuItem menuItem: pancakeHouseMenuItems) {
            System.out.println(menuItem);
        }
    }

    public void printDinerHouseMenu(){
        while (dinerHouseMenuItemsIterator.hasNext()) {
            System.out.println("True");
            System.out.println(dinerHouseMenuItemsIterator.next());
        }
    }

    public static void main(String[] args){
        ServingStaff servingStaff = new ServingStaff();
//        servingStaff.printPancakeHouseMenu();
        servingStaff.printDinerHouseMenu();
    }
}
