package main.java.composite.diner;

/**
 * Created by mpalanisamy on 8/30/16.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent menu_01 = new Menu("01", "menu 01");
        MenuComponent menu_02 = new Menu("02", "menu 02");
        MenuComponent menu_03 = new Menu("03", "menu 03");
        MenuComponent menu_0x = new Menu("0x", "menu 0x");

        MenuComponent menuItem_01 = new MenuItem("01", "menu item 01", true, 1.99);
        MenuComponent menuItem_02 = new MenuItem("02", "menu item 02", false, 2.99);
        MenuComponent menuItem_03 = new MenuItem("03", "menu item 03", true, 3.99);
        MenuComponent menuItem_0x = new MenuItem("0x", "menu item 0x", true, 4.99);

        menu_01.add(menuItem_01);
        menu_02.add(menuItem_02);
        menu_03.add(menuItem_03);
        menu_03.add(menu_0x);
        menu_0x.add(menuItem_0x);

        MenuComponent allMyMenus = new Menu("All Menus", "All Menus Description");
        allMyMenus.add(menu_01);
        allMyMenus.add(menu_02);
        allMyMenus.add(menu_03);
        allMyMenus.print();

    }
}
