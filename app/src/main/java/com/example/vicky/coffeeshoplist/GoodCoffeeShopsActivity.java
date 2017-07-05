package com.example.vicky.coffeeshoplist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class GoodCoffeeShopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_coffee_shop_list);

        GoodCoffeeShops goodCoffeeShops = new GoodCoffeeShops();

        ArrayList<CoffeeShop> list = goodCoffeeShops.getList();

        GoodCoffeeShopsAdapter coffeeShopAdapter = new GoodCoffeeShopsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(coffeeShopAdapter);
    }

    public void getCoffeeShop(View listItem) {
        CoffeeShop coffeeShop = (CoffeeShop) listItem.getTag();
        Log.d(getClass().toString(), coffeeShop.getName());
    }
}
