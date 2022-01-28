package shoppingcart;

public enum Item {
    APPLE(100),
    BANANA(200),
    MILK(500),
    FISH(2000);

    private final int price;

    private Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}



