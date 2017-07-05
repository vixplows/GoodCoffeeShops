package com.example.vicky.coffeeshoplist;

/**
 * Created by vicky on 05/07/2017.
 */

public class CoffeeShop {

    private String location;
    private String name;
    private int flatWhiteRating;
    private int icon;

    public CoffeeShop(String location, String name, Integer flatWhteRating, Integer icon) {
        this.location = location;
        this.name = name;
        this.flatWhiteRating = flatWhteRating;
        this.icon = icon;
    }

    public String getLocation() {return location;}

    public String getName() {return name;}

    public Integer getFlatWhiteRating() {return flatWhiteRating;}

    public Integer getIcon() {return icon; }

}
