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

class CreditCardStrategy implements PaymentStrategy {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    private String cardNumber;
        private String expiryDate;
        private String cvv;

        public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
            this.cvv = cvv;
        }
        public void pay(double amount) {
            System.out.println("Paying " + numberFormat.format(amount) + " with credit card.");
            // Perform the payment logic using credit card details
        }
}