package shoppingcart.printer;

import java.util.HashMap;
import java.util.Map;

import shoppingcart.Item;

public class PrinterItemFirst extends Printer {

    @Override
    public void printReceipt(HashMap<Item, Integer> contents) {
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
