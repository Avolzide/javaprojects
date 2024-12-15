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

class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(double amount) {
        // Perform the checkout process
        paymentStrategy.pay(amount);
    }
}