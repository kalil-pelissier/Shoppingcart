package shoppingcart;

import shoppingcart.printer.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Print receip with the item first \n");
        ShoppingCart cartItem = new ShoppingCart(new PrinterItemFirst());

        cartItem.addItem(Item.BANANA, 2);
        cartItem.addItem(Item.APPLE, 1);
        cartItem.addItem(Item.FISH, 1);

        cartItem.printReceipt();

        // --------------------------
        System.out.print("\n\n"); 

        System.out.println("Print receip with the price first \n");
        ShoppingCart cartPrice = new ShoppingCart(new PrinterPriceFirst());

        cartPrice.addItem(Item.BANANA, 2);
        cartPrice.addItem(Item.APPLE, 1);
        cartPrice.addItem(Item.FISH, 1);

        cartPrice.printReceipt();
    }
}
