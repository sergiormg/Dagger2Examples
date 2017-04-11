package com.sg.dagger2coffee.modules;

import com.sg.dagger2coffee.ElectricHeater;
import com.sg.dagger2coffee.Heater;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(includes = PumpModule.class)
public class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater(){
        return new ElectricHeater();
    }
}
