package com.escorps.retrodagger;

import android.app.Application;
import android.content.Context;

import com.escorps.retrodagger.component.AppComponent;
import com.escorps.retrodagger.component.DaggerAppComponent;
import com.escorps.retrodagger.domain.AnalyticsManager;
import com.escorps.retrodagger.modules.AppModule;

import javax.inject.Inject;

public class App extends Application {

    private AppComponent component;

    @Inject
    AnalyticsManager analyticsManager;

    @Override public void onCreate() {
        super.onCreate();
        setupGraph();
        analyticsManager.registerAppEnter();
    }

    private void setupGraph() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);
    }

    public AppComponent component() {
        return component;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }
}
