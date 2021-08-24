package com.GrocerStore;

import com.GrocerStore.Produce.Drink;
import com.GrocerStore.Produce.Fruit;
import com.GrocerStore.Produce.Produce;

public class Main {

    public static void main(String[] args) {
//        Produce prod = new Produce("apple", 89, "001", "red");
//        Fruit prod2 = new Fruit("orange", 249, "003", "bag of oranges", 5, true);
//        Produce prod3 = new Drink("whole milk",400, "#003", "gallon of milk", 1, 0);
//        System.out.println(prod2);
//        System.out.println(prod);
//        System.out.println(prod3);
//        System.out.println(Drink.VOLUME_UNITS[1]);

        Store myStand = new Store("myStand01");
        myStand.addProductToInventory();
        myStand.addDrinkToInventory();
        myStand.addFruitToInventory();
        myStand.displayInventory();

    }
}

