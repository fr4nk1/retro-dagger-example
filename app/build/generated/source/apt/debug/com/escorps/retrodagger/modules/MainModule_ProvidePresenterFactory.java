package com.escorps.retrodagger.modules;

import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.ui.main.MainPresenter;
import com.escorps.retrodagger.ui.main.MainView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainModule_ProvidePresenterFactory implements Factory<MainPresenter> {
  private final MainModule module;
  private final Provider<MainView> mainViewProvider;
  private final Provider<FindItemsInteractor> findItemsInteractorProvider;

  public MainModule_ProvidePresenterFactory(MainModule module, Provider<MainView> mainViewProvider, Provider<FindItemsInteractor> findItemsInteractorProvider) {  
    assert module != null;
    this.module = module;
    assert mainViewProvider != null;
    this.mainViewProvider = mainViewProvider;
    assert findItemsInteractorProvider != null;
    this.findItemsInteractorProvider = findItemsInteractorProvider;
  }

  @Override
  public MainPresenter get() {  
    MainPresenter provided = module.providePresenter(mainViewProvider.get(), findItemsInteractorProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MainPresenter> create(MainModule module, Provider<MainView> mainViewProvider, Provider<FindItemsInteractor> findItemsInteractorProvider) {  
    return new MainModule_ProvidePresenterFactory(module, mainViewProvider, findItemsInteractorProvider);
  }
}

