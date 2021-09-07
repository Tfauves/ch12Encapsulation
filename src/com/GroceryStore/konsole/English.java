package com.GroceryStore.konsole;

import com.GroceryStore.Store;

public class English extends UI {
    public String[] MENU = new String[] {
            "1. add product to inventory",
            "2. throw away a product",
            "3. list products available",
            "4. sell a product",
            "5. quit",
            "6. change language",
    };
    public String[] PRODUCT_TYPES = new String[] {
            "1. Drink",
            "2. Fruit",
    };
    public String[] ERROR_MSGS = new String[] {
            "OK",
            "Invalid number",
            "general exception",
            "Must enter something",
            "404 - Product not Found"
    };
    public String[] PRODUCT_FIELDS = new String[] {
            "Name:", "price:", "id:", "DescripTion:"
    };;
    public String[] DRINK_FIELDS = new String[] {
            "Volume:", "Volume Unit Code:"
    };
    public String[] FRUIT_FIELDS = new String[] {
            "Hardness Level:", "Is organic:"
    };

    public String   WELCOME = "Welcome to";
    public String   MENU_PROMPT = "What do you want to do?" ;
    public String   SELECT_PROMPT = "Enter selection:";
    public String   PRODUCT_PROMPT = "What kind of product?";
    public String   CANCEL_PROMPT = "press enter to cancel";

    public English(Store store) {
        super(store);
    }
}


