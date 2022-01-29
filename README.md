# ShoppingCart

This is a partial implementation of the software behind a supermarket till system.

The goal of the software is to record items as they're swiped through a supermarket till, and then to print a receipt for the supermarket customer. The normal workflow is for there to be multiple IShoppingCart.addItem calls, then a single call to IShoppingCart.printReceipt.


### Prerequisite
  > gradle 6

### Run
```
./gradlew run
```

### Build
```
./gradlew build
```

### Test
```
./gradlew test
```
