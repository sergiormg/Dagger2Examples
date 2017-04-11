package com.sg.dagger2coffee;

import dagger.Lazy;

import javax.inject.Inject;

public class CoffeeMaker {
    private final Lazy<Heater> heater;
    private final Pump pump;

    @Inject
    public CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println("coffee!");
        heater.get().off();
    }
}
