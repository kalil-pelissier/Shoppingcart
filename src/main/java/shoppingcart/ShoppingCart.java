package shoppingcart;

import java.util.*;

import shoppingcart.printer.Printer;

public class ShoppingCart implements IShoppingCart {
    private LinkedHashMap<Item, Integer> contents = new LinkedHashMap<>();
    private Printer printer;

    public ShoppingCart(Printer printer) {
        this.printer = printer;
    }

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

    public void printReceipt() {
        printer.printReceipt(this.contents);
    }
}
