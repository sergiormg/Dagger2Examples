package com.sg.androiddagger2.modules;

import com.sg.androiddagger2.NetworkApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    public NetworkApi getNetwork() {
        return new NetworkApi();
    }
}
