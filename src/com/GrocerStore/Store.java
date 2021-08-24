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

    public void addProductToInventory(String name, int price, String id, String description) {
        System.out.println("Add a product to inventory: y/n");
        String userChoice = scanner.next();
        scanner.nextLine();
        if (userChoice.equals("y")) {
            System.out.println("Name: ");
            String productName = scanner.nextLine();
            System.out.println("Price: ");
            int productPrice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Id: ");
            String productId = scanner.nextLine();
            System.out.println("Description ");
            String productDescription = scanner.nextLine();
            Produce product = new Produce(productName, productPrice, productId, productDescription);
            inventoryList.add(product);
        }

    }

    // TODO: 8/23/2021 Drink version
    public void addDrinkToInventory(String name, int price, String id, String description, int volume, String volumeUnit) {
        System.out.println("Add a drink to inventory: y/n");
        String userChoice = scanner.next();
        scanner.nextLine();
        if (userChoice.equals("y")) {
            System.out.println("Name: ");
            String drinkName = scanner.nextLine();
            System.out.println("Price: ");
            int drinkPrice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Id: ");
            String drinkId = scanner.nextLine();
            System.out.println("Description: ");
            String drinkDescription = scanner.nextLine();
            System.out.println("Volume: ");
            int drinkVolume = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Volume in units: ");
            String drinkVolUnit = scanner.nextLine();
            Drink drink = new Drink(drinkName, drinkPrice, drinkId, drinkDescription, drinkVolume, drinkVolUnit);
            inventoryList.add(drink);
        }
    }

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
