package shoppingcart;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(Item.BANANA, 2);
        cart.addItem(Item.APPLE, 1);
        cart.addItem(Item.FISH, 1);

        cart.printReceipt();
    }
}
