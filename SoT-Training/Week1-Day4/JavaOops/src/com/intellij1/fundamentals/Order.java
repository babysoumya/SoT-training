package com.intellij1.fundamentals;

public class Order {
    private final Customer customer;
    private final ShoppingCart cart;
    private final Payment payment;

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", cart=" + cart +
                ", payment=" + payment +
                '}';
    }

    public Order(Customer customer, ShoppingCart cart, Payment payment) {
        this.customer=customer;
        this.cart=cart;
        this.payment=payment;

    }
    public ShoppingCart getCart()
    {return cart;}

}
