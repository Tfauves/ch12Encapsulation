package com.GrocerStore;

import com.GrocerStore.Produce.Drink;
import com.GrocerStore.Produce.Fruit;
import com.GrocerStore.Produce.Produce;

public class Main {

    public static void main(String[] args) {
        Store myStand = new Store("myStand01");
        myStand.addToInventory("orange",249, "003","bag of oranges", 8);

        System.out.println(myStand.getInventory());
        System.out.println(myStand.getBalance());

    }
}

