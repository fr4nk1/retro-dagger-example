package com.escorps.retrodagger.component;

import com.escorps.retrodagger.App;
import com.escorps.retrodagger.domain.AnalyticsManager;
import com.escorps.retrodagger.domain.DomainModule;
import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.interactors.InteractorsModule;
import com.escorps.retrodagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                DomainModule.class,
                InteractorsModule.class
        }
)
public interface AppComponent {
    void inject(App app);

    AnalyticsManager getAnalyticsManager();
    FindItemsInteractor getFindItemsInteractor();
}