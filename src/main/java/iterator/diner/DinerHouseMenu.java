package main.java.iterator.diner;

/**
 * Created by muthu on 8/13/16.
 */
public class DinerHouseMenu {
    private static final int MAX_ITEMS  = 4;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerHouseMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("DH Pancake BrkFast",
                "Pancakes with egg and bacon",
                false,
                2.99);

        addItem("DH Pancake Regular",
                "Pancakes with egg and bacon, and toast",
                false,
                2.99);

        addItem("DH Waffles BrkFast",
                "Waffles with egg and bacon",
                false,
                3.49);

        addItem("DH Waffles Regular",
                "Waffles with egg and bacon, and toast",
                false,
                3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            throw new RuntimeException();
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

//    public MenuItem[] getMenuItems(){
//        return menuItems;
//    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
