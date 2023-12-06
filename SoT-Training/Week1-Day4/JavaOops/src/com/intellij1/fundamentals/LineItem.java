package com.intellij1.fundamentals;

import javax.sound.sampled.Line;

public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product,int quantity)
    {
        this.product=product;
        this.quantity=quantity;
    }
    ///////////copy contructor
    public LineItem(LineItem li)
    {
        this(li.product,li.quantity);
    }


    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity + ", price="+getPrice()+
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public int getPrice() {

        return (int)(product.getPrice()*quantity);
    }
}
