package com.sg.dagger2.components;

import com.sg.dagger2.BackendService;
import com.sg.dagger2.Main;
import com.sg.dagger2.User;
import com.sg.dagger2.modules.BackendServiceModule;
import com.sg.dagger2.modules.UserModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {UserModule.class, BackendServiceModule.class })
public interface MyComponent {

    BackendService provideBackendService();

    void inject(Main main);
}
