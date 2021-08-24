package com.GrocerStore.Produce;

public class Drink extends Produce{
    public final static String[] VOLUME_UNITS = new String[] {"Gal", "oz", "pt, qt" };
    private int volume;
    private String volumeUnit;

    public Drink(String name, int price, String id, String description, int volume, String volumeUnit) {
        super(name, price, id, description);
        this.volume = volume;
        this.volumeUnit = volumeUnit;
    }

    public Drink(String name, int price, String id, String description, int volume, int volumeUnit) {
        super(name, price, id, description);
        this.volume = volume;
        this.volumeUnit = VOLUME_UNITS[volumeUnit];
    }

    public String toString() {
        return super.toString() + " Volume " + volume + " | Unit: "  + " |";
    }
}
