package com.sg.dagger2.modules;

import com.sg.dagger2.BackendService;
import com.sg.dagger2.User;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class BackendServiceModule {

    @Provides
    @Singleton
    BackendService provideBackendService(@Named("serverUrl") String serverUrl, User user) {
        return new BackendService(serverUrl, user);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "http://www.github.com";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }
}
