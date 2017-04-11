package com.sg.androiddagger2.components;

import com.sg.androiddagger2.MainActivity;
import com.sg.androiddagger2.modules.NetworkApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    void inject(MainActivity mainActivity);
}
