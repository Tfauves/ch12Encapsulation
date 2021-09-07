package com.GroceryStore.konsole;

import com.GroceryStore.Store;

public class English extends UI {

    public English(Store store) {
        super(store);
        WELCOME = "Welcome to";
        MENU_PROMPT = "What do you want to do?" ;
        SELECT_PROMPT = "Enter selection:";
        PRODUCT_PROMPT = "What kind of product?";
        CANCEL_PROMPT = "press enter to cancel";
        MENU = new String[] {
                "1. add product to inventory",
                "2. throw away a product",
                "3. list products available",
                "4. sell a product",
                "5. quit",
                "6. change language",
        };
        PRODUCT_TYPES = new String[] {
                "1. Drink",
                "2. Fruit",
    };
        ERROR_MSGS = new String[] {
                "OK",
                "Invalid number",
                "general exception",
                "Must enter something",
                "404 - Product not Found"
        };
        PRODUCT_FIELDS = new String[] {
                "Name:", "price:", "id:", "DescripTion:"
        };
        DRINK_FIELDS = new String[] {
                "Volume:", "Volume Unit Code:"
        };
        FRUIT_FIELDS = new String[] {
                "Hardness Level:", "Is organic:"
        };
    }
}


