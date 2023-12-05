package com.intellij1.fundamentals;

import javax.swing.*;
import java.util.Optional;

public class Customer {
    private String name;
    private CreditCard cc;
    public Customer(String name, long cardno)
    {
        this.name=name;
        this.cc=new CreditCard(cardno);
    }
    public Optional<Order> checkout(ShoppingCart cart)
    {
        Optional<Payment>payment=cc.mkPayment(cart.getTotalCost());
        return payment.map(value->new Order(this,cart,value));
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                '}';
    }
}
