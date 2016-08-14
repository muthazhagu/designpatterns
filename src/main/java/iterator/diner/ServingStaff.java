package main.java.iterator.diner;

import java.util.ArrayList;

/**
 * Created by muthu on 8/13/16.
 */
public class ServingStaff {
    private PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    private ArrayList<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();

    private DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
    private MenuItem[] dinerHouseMenuItems = dinerHouseMenu.getMenuItems();

    public void printPancakeHouseMenu(){
        for (MenuItem menuItem: pancakeHouseMenuItems) {
            System.out.println(menuItem);
        }
    }

    public void printDinerHouseMenu(){
        for (MenuItem menuItem: dinerHouseMenuItems) {
            System.out.println(menuItem);
        }
    }

    public static void main(String[] args){
        ServingStaff servingStaff = new ServingStaff();
        servingStaff.printPancakeHouseMenu();
        servingStaff.printDinerHouseMenu();
    }
}
