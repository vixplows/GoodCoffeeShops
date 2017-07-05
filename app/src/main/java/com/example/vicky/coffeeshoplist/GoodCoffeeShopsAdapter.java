package com.example.vicky.coffeeshoplist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vicky on 05/07/2017.
 */

public class GoodCoffeeShopsAdapter extends ArrayAdapter<CoffeeShop> {

    public GoodCoffeeShopsAdapter(Context context, ArrayList<CoffeeShop> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.good_coffee_shop_item, parent, false);
        }

        CoffeeShop currentCoffeeShop = getItem(position);

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentCoffeeShop.getLocation());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentCoffeeShop.getName());

        TextView flatWhiteRating = (TextView) listItemView.findViewById(R.id.rating);
        flatWhiteRating.setText(currentCoffeeShop.getFlatWhiteRating().toString());

        listItemView.setTag(currentCoffeeShop);

        return listItemView;
    }

}
