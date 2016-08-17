package main.java.iterator.diner;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by muthu on 8/13/16.
 */
public class ServingStaff {
    private ArrayList<Menu> menus;

    public ServingStaff(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();
        while(menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args){
        PancakeHouseMenu p = new PancakeHouseMenu();
        DinerHouseMenu d = new DinerHouseMenu();
        CafeMenu c = new CafeMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(p);
        menus.add(d);
        menus.add(c);

        ServingStaff servingStaff = new ServingStaff(menus);
        servingStaff.printMenu();
    }
}
