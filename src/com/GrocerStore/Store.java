package com.GrocerStore;

import com.GrocerStore.Produce.Drink;
import com.GrocerStore.Produce.Fruit;
import com.GrocerStore.Produce.Produce;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Produce> inventoryList = new ArrayList<>();
    private int balance = 500_00;
    private String name;

    public Store(String name) {
        this.name = name;
    }

    public void addToInventory(Produce produce) {
        Produce product = new Produce();
        addToInventory(product);

    }

    // TODO: 8/23/2021 Drink version
    public void addTOInventory() {
        Drink drink = new Drink();
        addToInventory(drink);
    }

    // TODO: 8/23/2021 fruit version.
    public void addToInventory() {
        Fruit fruit = new Fruit();
        addToInventory(fruit);
    }


}
