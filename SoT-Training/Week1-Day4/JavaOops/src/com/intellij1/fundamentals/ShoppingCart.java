package com.intellij1.fundamentals;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart
{
    private List<LineItem> LineItems=new ArrayList<>();
    public void addLineItem(LineItem li)
    {
        LineItems.add(li);
    }
    public int getTotalCost()
    {
        return LineItems.stream().mapToInt(LineItem::getPrice).sum();
    }

    public List<LineItem>getLineItems()
    {
        return LineItems.stream().map(LineItem::new).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "LineItems=" + LineItems +
                '}';
    }
}
