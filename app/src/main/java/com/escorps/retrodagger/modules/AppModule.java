package com.escorps.retrodagger.modules;

import android.app.Application;

import com.escorps.retrodagger.App;
import com.escorps.retrodagger.domain.DomainModule;
import com.escorps.retrodagger.interactors.InteractorsModule;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                App.class
        },
        includes = {
                DomainModule.class,
                InteractorsModule.class
        }
)
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides public Application provideApplication() {
        return app;
    }
}
