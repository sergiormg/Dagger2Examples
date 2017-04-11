package com.sg.dagger2coffee;

import javax.inject.Inject;

public class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    public void pump() {
        if(heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
