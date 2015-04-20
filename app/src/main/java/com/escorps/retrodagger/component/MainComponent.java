package com.escorps.retrodagger.component;

import com.escorps.retrodagger.ActivityScope;
import com.escorps.retrodagger.modules.MainModule;
import com.escorps.retrodagger.ui.main.MainActivity;
import com.escorps.retrodagger.ui.main.MainPresenter;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);
    MainPresenter getMainPresenter();
}