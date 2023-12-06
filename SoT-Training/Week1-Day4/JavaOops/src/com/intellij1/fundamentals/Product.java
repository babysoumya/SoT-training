package com.intellij1.fundamentals;

public class Product {
   private String name;
  private int price;
   private ProductType type;
  private int discount;
  private int weight;


    public int getPrice() {
        int shippingCost=type.getShippingcost(weight);

      return   (int)(price *(100- discount)/100.0)+shippingCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", discount=" + discount +
                ", weight=" + weight +
                '}';
    }

    public Product(String name, int price, ProductType type, int weight)
    {
        this.name=name;
        this.price=price;
        this.type=type;
        this.weight=weight;
    }
}
