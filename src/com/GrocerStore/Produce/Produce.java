package com.GrocerStore.Produce;

import java.text.NumberFormat;

public class Produce {
    private String name;
    private int price;
    private String id;
    private String description;

    public Produce(String name, int price, String id, String description) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.description = description;

    }

    public String getDisplayPrice() {
        return NumberFormat.getCurrencyInstance().format(price/100.0);
    }

    @Override
    public String toString() {
        String output = "| id: " + id + " | name: " + name + " | price: " + getDisplayPrice() + " | ";

        return output;
    }
}
