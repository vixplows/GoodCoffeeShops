package com.example.vicky.coffeeshoplist;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by vicky on 05/07/2017.
 */

public class CoffeeShopTest {

    CoffeeShop coffeeShop;

    @Before
    public void before() { coffeeShop = new CoffeeShop("Leith", "Printworks Coffee", 7, R.drawable.coffee_c); }

    @Test
    public void getLocationTest() {
        assertEquals("Leith", coffeeShop.getLocation());
    }

    @Test
    public void getNameTest() {
        assertEquals("Printworks Coffee", coffeeShop.getName());
    }

    @Test
    public void getflatWhiteRatingTest() {
        assertEquals((Integer)7, coffeeShop.getFlatWhiteRating());
    }

    @Test
    public void getIconTest() {
        assertEquals((Integer)R.drawable.coffee_c, coffeeShop.getIcon());
    }

}
