package com.example.vicky.coffeeshoplist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vicky on 05/07/2017.
 */

public class GoodCoffeeShopTest {

    @Test
    public void getListTest() {
        GoodCoffeeShops goodCoffeeShops = new GoodCoffeeShops();
        assertEquals(11, goodCoffeeShops.getList().size());
    }
}
