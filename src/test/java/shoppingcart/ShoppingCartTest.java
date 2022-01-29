package shoppingcart;

import org.junit.Test;

import shoppingcart.printer.Printer;
import shoppingcart.printer.PrinterItemFirst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class ShoppingCartTest {

    Printer myPrinter = new PrinterItemFirst();

    @Test
    public void canAddAnItem() {
        ShoppingCart sc = new ShoppingCart(myPrinter);

        sc.addItem(Item.APPLE, 1);

        assertTrue(sc.getContent().containsKey(Item.APPLE));
    }

    @Test
    public void canIncrementItemAlreadyExists() {
        ShoppingCart sc = new ShoppingCart(myPrinter);

        sc.addItem(Item.APPLE, 1);
        sc.addItem(Item.APPLE, 3);

        assertTrue(sc.getContent().containsKey(Item.APPLE));
        assertEquals((int)sc.getContent().get(Item.APPLE), 4);
    }

    @Test
    public void canAddMoreThanOneItem() {
        ShoppingCart sc = new ShoppingCart(myPrinter);

        sc.addItem(Item.APPLE, 2);

        assertNotNull(sc.getContent().get(Item.APPLE));
        assertEquals((int)sc.getContent().get(Item.APPLE), 2);
    }

    @Test
    public void canAddDifferentItems() {
        ShoppingCart sc = new ShoppingCart(myPrinter);

        sc.addItem(Item.APPLE, 2);
        sc.addItem(Item.BANANA, 1);

        assertNotNull(sc.getContent().get(Item.APPLE));
        assertNotNull(sc.getContent().get(Item.BANANA));
    }
}


