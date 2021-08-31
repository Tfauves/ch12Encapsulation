package com.GrocerStore.console;

import com.GrocerStore.Store;

import java.util.Scanner;

public class UI {
    private static final Scanner scanner = new Scanner(System.in);
    private final static String[] MENU = new String[] {
            "1. add product to inventory",
            "2. throw away a product",
            "3. list all products",
            "4. sell a product",
            "5. quit"
    };
    private final static String[] PRODUCT_TYPES = new String[] {
            "1. Drink",
            "2. Fruit"
    };

    public static void welcome(String name) {
        System.out.println("Welcome to " + name + "!");
    }

    public static void optionMenu(String prompt, String[] options) {
        System.out.println(prompt);
        for (String option : options) {}
        System.out.println("What would you like to do?");
        System.out.println("1. add product to inventory");
        System.out.println("2. throw away a product");
        System.out.println("3. list all products");
        System.out.println("4. sell a product");
        System.out.println("5. quit");
    }

    public void start(Store store) {
        welcome(store.getName());
        optionMenu("what do you want to do", MENU);
        int choice = getInt(1, 5, "Enter selection between 1 and 5:");
        handleMenuSelection(choice);
    }

    public static int getInt(int min, int max, String prompt) {
        int option = min - 1;
        do {
            String input = scanner.next();
            // TODO: 8/30/2021 put in a try catch block if the user enters a non integer
            try {
                option = Integer.parseInt(input);
            }
            catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Invalid entry please enter a positive number");
            }
        } while (option < min || option > max);
        return option;
    }

    public void handleMenuSelection(int choice) {
        switch (choice){
            case 1:
                addProduct();
                break;
            case 2:
                throwAwayProduct();
                break;
            case 3:
                displayProducts();
                break;
            case 4:
                sellProduct();
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }

    private static void addProduct() {
        optionMenu("What kind of product?", PRODUCT_TYPES);
        int choice = getInt(1, PRODUCT_TYPES.length, "enter a number");
        switch (choice) {
            case 1 -> getDrinkDetails();
            case 2 -> getFruitDetails();
            default -> System.out.println("Invalid");
        }

    }



    private static void throwAwayProduct() {

    }

    private static void displayProducts() {

    }

    private static void sellProduct() {

    }

}
