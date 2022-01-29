package shoppingcart.printer;

import java.util.HashMap;
import java.util.Map;

import shoppingcart.Item;

public class PrinterPriceFirst extends Printer {

    @Override
    public void printReceipt(HashMap<Item, Integer> contents) {
        int totalPrice = 0;

        for(Map.Entry<Item, Integer> entry : contents.entrySet()) {
            int price = entry.getKey().getPrice() * entry.getValue();
            totalPrice += price;
            System.out.println(String.format("€%.2f", centToEuro(price)) + " - " + entry.getKey() + " - " + entry.getValue());
        }       

        System.out.println("--------------------------------");
        System.out.println("Total : " + String.format("€%.2f", centToEuro(totalPrice)));
    }

    
    
}
