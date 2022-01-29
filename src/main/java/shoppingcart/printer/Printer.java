package shoppingcart.printer;

import java.util.HashMap;

import shoppingcart.Item;

public abstract class Printer {
    protected float centToEuro(int eu) {
        return eu/100;
    }

    public abstract void printReceipt(HashMap<Item, Integer> contents);
}
