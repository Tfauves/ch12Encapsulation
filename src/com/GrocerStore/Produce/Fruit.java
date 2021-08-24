package com.GrocerStore.Produce;

public class Fruit extends Produce{
    private String type;
    private String brand;
    private boolean isOrganic;
    private int hardness;


    public Fruit(String name, int price, String id, String description, int hardness) {
        super(name, price, id, description);
        isOrganic = false;
        this.hardness = hardness;
    }

    public Fruit(String name, int price, String id, String description, int hardness, boolean isOrganic) {
        super(name, price, id, description);
        this.isOrganic = isOrganic;
        this.hardness = hardness;
    }

    public String toString() {
        return super.toString() + " isOrganic " + isOrganic + " | hardness: " + hardness + " |";
    }

}
