package com.intellij1.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    private List<Product> products=new ArrayList<>();
    public void addProduct(Product p)
    {
        products.add(p);
    }
    public int getTotalCost()
    {
        return products.stream().mapToInt(Product::getPrice).sum();
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
