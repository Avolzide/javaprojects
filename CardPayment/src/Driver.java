/*
* David Cortinez
* Module 7 Lab 3
* Purpose: Add a gift card payment option to the existing strategy pattern implementation:
*
* *** Outline ***
* Implement a new class called GiftCardStrategy that implements the PaymentStrategy interface.

The GiftCardStrategy class should have the following attributes:

cardNumber (String): The gift card number.

pin (String): The PIN for the gift card.

Implement the pay() method in the GiftCardStrategy class. The method should output a message stating that the payment amount has been deducted from the gift card balance.
 */

public class Driver {
    // Usage
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            // Set the payment strategy dynamically
            cart.setPaymentStrategy(new CreditCardStrategy("1234 5678 9012 3456", "12/23", "123"));
            cart.checkout(100.0);
            // Change the payment strategy at runtime
            cart.setPaymentStrategy(new PayPalStrategy("example@example.com", "password"));
            cart.checkout(50.0);

            cart.setPaymentStrategy(new GiftCardStrategy("9999 2222 1111 4444", "0900"));
            cart.checkout(30.0);
        }
    }
