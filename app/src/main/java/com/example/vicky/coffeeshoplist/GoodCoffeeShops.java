package com.example.vicky.coffeeshoplist;

import java.util.ArrayList;

/**
 * Created by vicky on 05/07/2017.
 */

public class GoodCoffeeShops {

    private ArrayList<CoffeeShop> list;

    public GoodCoffeeShops() {
        list = new ArrayList<CoffeeShop>();
        list.add(new CoffeeShop("AbbeyHill", "Century General Store", 9, R.drawable.cgstore));
        list.add(new CoffeeShop("Waverly", "Baba Budan", 9, R.drawable.coffee_a));
        list.add(new CoffeeShop("West Port", "LoveCrumbs", 8, R.drawable.coffee_b));
        list.add(new CoffeeShop("New Town", "Cairngorm Coffee", 7, R.drawable.coffee_c));
        list.add(new CoffeeShop("Broughton", "Artisan Roast", 7, R.drawable.coffee_d));
        list.add(new CoffeeShop("Leith", "Twelve Triangles", 8, R.drawable.coffee_e));
        list.add(new CoffeeShop("Newington", "Filament Coffee", 9, R.drawable.coffee_a));
        list.add(new CoffeeShop("Newington", "Black Medicine", 7, R.drawable.coffee_b));
        list.add(new CoffeeShop("Leith", "Printworks Coffee", 7, R.drawable.coffee_c));
        list.add(new CoffeeShop("Leith", "Cafe Qubi", 6, R.drawable.coffee_d));
        list.add(new CoffeeShop("Tollcross", "Cafe Class", 8, R.drawable.coffee_e));

    }

    public ArrayList<CoffeeShop> getList() { return new ArrayList<CoffeeShop>(list); }

}
