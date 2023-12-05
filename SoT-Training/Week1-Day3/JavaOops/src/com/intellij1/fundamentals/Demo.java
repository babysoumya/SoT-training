package com.intellij1.fundamentals;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        Product s=Catalogue.getProduct("shirt");
        Product p=new Product("pant", 700);

        cart.addProduct(s);
        cart.addProduct(p);
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
