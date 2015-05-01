package com.escorps.retrodagger.interactors;

import com.escorps.retrodagger.adapter.RestApiAdapter;
import com.escorps.retrodagger.api.MyApi;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class InteractorsModule {

    @Provides public FindItemsInteractor provideFindItemsInteractor(MyApi myApi) {
        return new FindItemsInteractorImpl(myApi);
    }

    @Provides public MyApi provideMyApi(RestAdapter restAdapter) {
        return restAdapter.create(MyApi.class);
    }

    @Provides public RestAdapter provideRestAdapter() {
        return RestApiAdapter.getInstance();
    }

}
