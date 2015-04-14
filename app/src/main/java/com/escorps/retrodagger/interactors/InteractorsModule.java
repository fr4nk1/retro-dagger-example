package com.escorps.retrodagger.interactors;

import dagger.Module;
import dagger.Provides;

@Module(
        library = true
)
public class InteractorsModule {

    @Provides public FindItemsInteractor provideFindItemsInteractor() {
        return new FindItemsInteractorImpl();
    }

}
