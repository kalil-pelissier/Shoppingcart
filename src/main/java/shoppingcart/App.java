/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package shoppingcart;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Pricer pricer = new Pricer();
        ShoppingCart cart = new ShoppingCart(pricer);

        cart.addItem("banana", 2);
        cart.addItem("apple", 1);

        cart.printReceipt();

        // System.out.println(new App().getGreeting());
    }
}
