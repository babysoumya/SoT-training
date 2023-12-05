package com.intellij1.fundamentals;

public class Product {
    String name;
    int price;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String name, int price)
    {
        this.name=name;
        this.price=price;
    }
}
