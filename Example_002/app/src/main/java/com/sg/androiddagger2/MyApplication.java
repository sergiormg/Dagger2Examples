package com.sg.androiddagger2;

import android.app.Application;

import com.sg.androiddagger2.components.DaggerDiComponent;
import com.sg.androiddagger2.components.DiComponent;

public class MyApplication extends Application {
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
