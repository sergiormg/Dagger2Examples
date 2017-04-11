package com.sg.dagger2.modules;

import com.sg.dagger2.User;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Sérgio");
    }
}
