package com.example.vicky.coffeeshoplist;

import java.util.ArrayList;

/**
 * Created by vicky on 05/07/2017.
 */

public class GoodCoffeeShops {

    private ArrayList<CoffeeShop> list;

    public GoodCoffeeShops() {
        list = new ArrayList<CoffeeShop>();
        list.add(new CoffeeShop("AbbeyHill", "Century General Store", 9));
        list.add(new CoffeeShop("Waverly", "Baba Budan", 9));
        list.add(new CoffeeShop("West Port", "LoveCrumbs", 8));
        list.add(new CoffeeShop("New Town", "Cairngorm Coffee", 7));
        list.add(new CoffeeShop("Broughton", "Artisan Roast", 7));
        list.add(new CoffeeShop("Leith", "Twelve Triangles", 8));
        list.add(new CoffeeShop("Newington", "Filament Coffee", 9));
        list.add(new CoffeeShop("Newington", "Black Medicine", 7));
    }

    public ArrayList<CoffeeShop> getList() { return new ArrayList<CoffeeShop>(list); }

}
