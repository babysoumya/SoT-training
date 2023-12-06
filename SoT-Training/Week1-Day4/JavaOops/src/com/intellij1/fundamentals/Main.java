package com.intellij1.fundamentals;

import javax.sound.sampled.Line;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        Product s=Catalogue.getProduct("shirt");
        Product p=Catalogue.getProduct("pant");
        Product e=Catalogue.getProduct("Algorithms(book)");

        cart.addLineItem(new LineItem(s,2));
        cart.addLineItem(new LineItem(p,3));
        cart.addLineItem(new LineItem(e,1));
        System.out.println(cart);
        System.out.println(cart.getTotalCost());

        Customer azad=new Customer("Azad");
        azad.addPaymentMethod("Azad Credit card",new CreditCard(5420793615183044L));
        azad.addPaymentMethod("Azad Bank Account",new BankAccount(80_80_80, 00646160));

        Optional<Order> order=azad.checkout(cart,"Azad Bank Account");
        System.out.println(order);
    }
}
