package com.GrocerStore;

import com.GrocerStore.Produce.Drink;
import com.GrocerStore.Produce.Fruit;
import com.GrocerStore.Produce.Produce;
import com.GrocerStore.util.Formatter;

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
        if(produce.getPrice() > balance) {
            System.out.println("no funds");
            return;
        }
        balance -= produce.getPrice();
        inventoryList.add(produce);
    }

    public void addToInventory(String name, int price, String id, String description, int volume, String volumeUnit) {
        Drink drink = new Drink(name, price, id, description, volume, volumeUnit);
        addToInventory(drink);
    }

    public void addToInventory(String name, int price, String id, String description, int hardness) {
        Fruit fruit = new Fruit(name, price, id, description, hardness);
        addToInventory(fruit);

    }

    public void throwAway(Produce produce) {
        inventoryList.remove(produce);
    }

    public void displayInventory() {
        for (Produce produce : inventoryList) {
            System.out.println(produce.toString());
        }
    }

    public String getInventory() {
        String outPut = "";
        for (Produce produce : inventoryList) {
            outPut += produce + "\n";
        }
        return outPut;
    }

    public String getBalance() {
        return Formatter.getDisplayPrice(balance);
    }

    public String getName() {
        return name;
    }
}
