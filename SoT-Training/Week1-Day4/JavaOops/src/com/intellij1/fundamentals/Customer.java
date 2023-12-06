package com.intellij1.fundamentals;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Customer implements Comparable<Customer> {
    private String name;
    private Map<String,PaymentMethod>pms=new HashMap<>();
   public  void addPaymentMethod(String nickname,PaymentMethod PM)
    {
        pms.put(nickname,PM);
    }
    public int calculateDiscount() {
        return 0;
    }
    public Customer(String name)
    {
        this.name=name;
    }
    public Optional<Order> checkout(ShoppingCart cart, String paymentMethodNickname) {
        Optional<PaymentMethod> paymentMethod =
                Optional.ofNullable(pms.get(paymentMethodNickname));
        Optional<Payment> payment = paymentMethod.flatMap(pm -> pm.mkPayment(cart.getTotalCost()));
        return payment.map(value -> new Order(this, cart, value));
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", paymentMethods=" + pms +
                '}';
    }
}
