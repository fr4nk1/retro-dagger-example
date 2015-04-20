package com.escorps.retrodagger.component;

import com.escorps.retrodagger.adapter.RecyclerViewAdapter;
import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.modules.MainModule;
import com.escorps.retrodagger.modules.MainModule_ProvidePresenterFactory;
import com.escorps.retrodagger.modules.MainModule_ProvideRecyclerViewAdapterFactory;
import com.escorps.retrodagger.modules.MainModule_ProvideViewFactory;
import com.escorps.retrodagger.ui.main.MainActivity;
import com.escorps.retrodagger.ui.main.MainActivity_MembersInjector;
import com.escorps.retrodagger.ui.main.MainPresenter;
import com.escorps.retrodagger.ui.main.MainView;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMainComponent implements MainComponent {
  private Provider<MainView> provideViewProvider;
  private Provider<FindItemsInteractor> getFindItemsInteractorProvider;
  private Provider<MainPresenter> providePresenterProvider;
  private Provider<RecyclerViewAdapter> provideRecyclerViewAdapterProvider;
  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerMainComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideViewProvider = MainModule_ProvideViewFactory.create(builder.mainModule);
    this.getFindItemsInteractorProvider = new Factory<FindItemsInteractor>() {
      @Override public FindItemsInteractor get() {
        FindItemsInteractor provided = builder.appComponent.getFindItemsInteractor();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.providePresenterProvider = MainModule_ProvidePresenterFactory.create(builder.mainModule, provideViewProvider, getFindItemsInteractorProvider);
    this.provideRecyclerViewAdapterProvider = MainModule_ProvideRecyclerViewAdapterFactory.create(builder.mainModule);
    this.mainActivityMembersInjector = MainActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePresenterProvider, provideRecyclerViewAdapterProvider);
  }

  @Override
  public void inject(MainActivity activity) {  
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public MainPresenter getMainPresenter() {  
    return providePresenterProvider.get();
  }

  public static final class Builder {
    private MainModule mainModule;
    private AppComponent appComponent;
  
    private Builder() {  
    }
  
    public MainComponent build() {  
      if (mainModule == null) {
        throw new IllegalStateException("mainModule must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException("appComponent must be set");
      }
      return new DaggerMainComponent(this);
    }
  
    public Builder mainModule(MainModule mainModule) {  
      if (mainModule == null) {
        throw new NullPointerException("mainModule");
      }
      this.mainModule = mainModule;
      return this;
    }
  
    public Builder appComponent(AppComponent appComponent) {  
      if (appComponent == null) {
        throw new NullPointerException("appComponent");
      }
      this.appComponent = appComponent;
      return this;
    }
  }
}

