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

import java.text.NumberFormat;

class PayPalStrategy implements PaymentStrategy {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    private String email;
    private String password;
    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public void pay(double amount) {
        System.out.println("Paying " + numberFormat.format(amount) + " with PayPal.");
        // Perform the payment logic using PayPal credentials
    }
}