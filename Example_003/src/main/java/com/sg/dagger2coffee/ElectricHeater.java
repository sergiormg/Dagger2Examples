package com.sg.dagger2coffee;

public class ElectricHeater implements Heater{
    private boolean heating;

    public void on() {
        heating = true;
    }

    public void off() {
        this.heating = false;
    }

    public boolean isHot() {
        return this.heating;
    }
}
