package main.java.composite.diner;

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
}
