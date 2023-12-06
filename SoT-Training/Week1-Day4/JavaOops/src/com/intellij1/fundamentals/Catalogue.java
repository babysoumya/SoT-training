package com.intellij1.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {


    public static final int SHIPPING_RATE = 5;
    private static Map<String,Product> productMap=Map.of("shirt",new Product("shirt",450,ProductType.PHYSICAL,30),"pant",new Product("pant",700,ProductType.PHYSICAL,50),"Algorithms(book)", new Product("Algorithms(book)", 1000, ProductType.DIGITAL, 0));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
