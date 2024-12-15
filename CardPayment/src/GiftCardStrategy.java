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

import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;

public class GiftCardStrategy implements PaymentStrategy {

    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    private String cardNumber;
    private String pin;

    public GiftCardStrategy(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + numberFormat.format(amount) + " with gift card.");
    }
}
