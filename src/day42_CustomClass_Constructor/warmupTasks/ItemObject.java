package day42_CustomClass_Constructor.warmupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObject {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("cheese", 9.99, 1)));
        items.addAll(Arrays.asList(
                new Item("bread", 4.99, 2)));
        items.addAll(Arrays.asList(
                new Item("milk", 5.99, 3)));
        items.addAll(Arrays.asList(
                new Item("cake", 12.99, 1)));
        items.addAll(Arrays.asList(
                new Item("water", 2.99, 4)));
        items.addAll(Arrays.asList(
                new Item("gum", 1.99, 5)));


        // calculate total price of all items
        double totalPrice = 0;
        for (Item eachItem : items) {
            totalPrice+=eachItem.calcCost();
        }

        System.out.println("totalPrice = " + totalPrice); // $72.84

        // remove items that cost more than $3
        items.removeIf(item-> item.unitPrice > 3);
        System.out.println("totalPrice = " + totalPrice); //
    }
}
