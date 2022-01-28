package shoppingcart;

import java.util.*;

public class ShoppingCart implements IShoppingCart {
    private LinkedHashMap<Item, Integer> contents = new LinkedHashMap<>();

    public HashMap<Item, Integer> getContent() {
        return contents;
    }

    public void addItem(Item itemType, int number) {
        if (!contents.containsKey(itemType)) {
            contents.put(itemType, number);
        } else {
            int existing = contents.get(itemType);
            contents. put(itemType, existing + number);
        }
    }

    private float centToEuro(int eu) {
        return eu/100;
    }

    public void printReceipt() {
        int totalPrice = 0;

        for(Map.Entry<Item, Integer> entry : contents.entrySet()) {
            int price = entry.getKey().getPrice() * entry.getValue();
            totalPrice += price;
            System.out.println(entry.getKey() + " - " + entry.getValue() + " - " + String.format("€%.2f", centToEuro(price)));
        }       

        System.out.println("--------------------------------");
        System.out.println("Total : " + String.format("€%.2f", centToEuro(totalPrice)));
    }
}
