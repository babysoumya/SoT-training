package com.intellij1.fundamentals;

import java.util.UUID;

public class Payment {
    private final PaymentMethod paymentmethod;
    private final UUID transactionId;
    private int value;

    @Override
    public String toString() {
        return "Payment{" +
                "payment method=" + paymentmethod +
                ", transactionId=" + transactionId +
                ", value=" + value +
                '}';
    }

    public Payment(PaymentMethod paymentMethod, int value, UUID transactionId) {
        this.paymentmethod = paymentMethod;
        this.value = value;
        this.transactionId = transactionId;
    }

}
