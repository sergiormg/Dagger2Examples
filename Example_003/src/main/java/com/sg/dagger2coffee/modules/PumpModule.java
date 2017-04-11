package com.sg.dagger2coffee.modules;

import com.sg.dagger2coffee.Pump;
import com.sg.dagger2coffee.Thermosiphon;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PumpModule {
    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
