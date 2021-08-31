package com.GrocerStore;

import com.GrocerStore.Produce.Drink;
import com.GrocerStore.Produce.Fruit;
import com.GrocerStore.Produce.Produce;
import com.GrocerStore.console.UI;
public class Main {

    public static void main(String[] args) {
        Store myStand = new Store("myStand01");
        UI storeUI = new UI();
        storeUI.start(myStand);
        myStand.addToInventory("orange",249, "003","bag of oranges", 6);
        myStand.addToInventory("apple",289, "005","granny smith apples", 8);
        myStand.addToInventory("milk",389, "0008","gallon of milk", 1, "gal");
        myStand.addToInventory("coffee",100, "01","cup of coffee", 1, "cup");
        myStand.displayInventory();
        System.out.println(myStand.getBalance());
//       System.out.println(myStand.getInventory());

    }
}

