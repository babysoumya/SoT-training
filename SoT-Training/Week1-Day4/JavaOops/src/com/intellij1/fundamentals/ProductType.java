package com.intellij1.fundamentals;

enum ProductType {
    DIGITAL(0), PHYSICAL(Catalogue.SHIPPING_RATE);

    private final int shippingRate;

    ProductType(int shippingRate) {
        this.shippingRate=shippingRate;
    }

    public int getShippingcost(int weight) {
        return shippingRate*weight;
    }
}
