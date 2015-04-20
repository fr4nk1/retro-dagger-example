package com.escorps.retrodagger.modules;

import com.escorps.retrodagger.adapter.RecyclerViewAdapter;
import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.ui.main.MainPresenter;
import com.escorps.retrodagger.ui.main.MainPresenterImpl;
import com.escorps.retrodagger.ui.main.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides public MainView provideView() {
        return view;
    }

    @Provides
    public MainPresenter providePresenter(MainView mainView, FindItemsInteractor findItemsInteractor) {
        return new MainPresenterImpl(mainView, findItemsInteractor);
    }

    @Provides
    public RecyclerViewAdapter provideRecyclerViewAdapter (){
        return new RecyclerViewAdapter();
    }
}
