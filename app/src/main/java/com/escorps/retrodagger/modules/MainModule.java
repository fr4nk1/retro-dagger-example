package com.escorps.retrodagger.modules;

import com.escorps.retrodagger.AppModule;
import com.escorps.retrodagger.adapter.RecyclerViewAdapter;
import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.ui.main.MainActivity;
import com.escorps.retrodagger.ui.main.MainPresenter;
import com.escorps.retrodagger.ui.main.MainPresenterImpl;
import com.escorps.retrodagger.ui.main.MainView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = MainActivity.class,
        addsTo = AppModule.class
)
public class MainModule {

    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides @Singleton public MainView provideView() {
        return view;
    }

    @Provides @Singleton
    public MainPresenter providePresenter(MainView mainView, FindItemsInteractor findItemsInteractor) {
        return new MainPresenterImpl(mainView, findItemsInteractor);
    }

    @Provides @Singleton
    public RecyclerViewAdapter provideRecyclerViewAdapter (){
        return new RecyclerViewAdapter();
    }
}
