package com.sg.dagger2coffee.components;

import com.sg.dagger2coffee.CoffeeMaker;
import com.sg.dagger2coffee.modules.DripCoffeeModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DripCoffeeModule.class})
public interface CoffeeShop {
    CoffeeMaker maker();
}