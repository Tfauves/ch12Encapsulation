package com.GrocerStore;

import com.GrocerStore.Produce.Drink;
import com.GrocerStore.Produce.Fruit;
import com.GrocerStore.Produce.Produce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    public final Scanner scanner = new Scanner(System.in);
    private List<Produce> inventoryList = new ArrayList<>();
    private int balance = 500_00;
    private String name;

    public Store(String name) {
        this.name = name;
    }

    public void addToInventory(String name, int price, String id, String description) {
        System.out.println("Name: ");
        String productName = scanner.nextLine();

        System.out.println("Price: ");
        int productPrice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Id: ");
        String productId = scanner.nextLine();
        System.out.println("description ");
        String productDescription = scanner.nextLine();
        Produce product = new Produce(productName, productPrice, productId, productDescription);
        inventoryList.add(product);

    }
//
//    // TODO: 8/23/2021 Drink version
//    public void addTOInventory() {
//        Drink drink = new Drink();
//        inventoryList.add(drink);
//    }
//
//    // TODO: 8/23/2021 fruit version.
//    public void addToInventory() {
//        Fruit fruit = new Fruit();
//        inventoryList.add(fruit);
//    }

    public void displayInventory() {
        for (Produce produce : inventoryList) {
            System.out.println(produce.toString());
        }
    }


}
