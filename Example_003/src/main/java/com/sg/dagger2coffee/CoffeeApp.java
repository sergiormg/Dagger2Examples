package com.sg.dagger2coffee;

import com.sg.dagger2coffee.components.CoffeeShop;
import com.sg.dagger2coffee.components.DaggerCoffeeShop;

public class CoffeeApp {

    public static void main(String[] args) {
        CoffeeShop coffee = DaggerCoffeeShop.builder().build();
        coffee.maker().brew();
    }
}
