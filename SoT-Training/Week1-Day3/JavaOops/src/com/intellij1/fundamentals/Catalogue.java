package com.intellij1.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    private static Map<String,Product> productMap=Map.of("shirt",new Product("shirt",450),"pant",new Product("pant",700));
    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
