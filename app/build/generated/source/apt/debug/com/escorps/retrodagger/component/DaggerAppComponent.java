package com.escorps.retrodagger.component;

import android.app.Application;
import com.escorps.retrodagger.App;
import com.escorps.retrodagger.App_MembersInjector;
import com.escorps.retrodagger.domain.AnalyticsManager;
import com.escorps.retrodagger.domain.DomainModule;
import com.escorps.retrodagger.domain.DomainModule_ProvideAnalyticsManagerFactory;
import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.interactors.InteractorsModule;
import com.escorps.retrodagger.interactors.InteractorsModule_ProvideFindItemsInteractorFactory;
import com.escorps.retrodagger.modules.AppModule;
import com.escorps.retrodagger.modules.AppModule_ProvideApplicationFactory;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<Application> provideApplicationProvider;
  private Provider<AnalyticsManager> provideAnalyticsManagerProvider;
  private MembersInjector<App> appMembersInjector;
  private Provider<FindItemsInteractor> provideFindItemsInteractorProvider;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApplicationProvider = ScopedProvider.create(AppModule_ProvideApplicationFactory.create(builder.appModule));
    this.provideAnalyticsManagerProvider = ScopedProvider.create(DomainModule_ProvideAnalyticsManagerFactory.create(builder.domainModule, provideApplicationProvider));
    this.appMembersInjector = App_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideAnalyticsManagerProvider);
    this.provideFindItemsInteractorProvider = InteractorsModule_ProvideFindItemsInteractorFactory.create(builder.interactorsModule);
  }

  @Override
  public void inject(App app) {  
    appMembersInjector.injectMembers(app);
  }

  @Override
  public AnalyticsManager getAnalyticsManager() {  
    return provideAnalyticsManagerProvider.get();
  }

  @Override
  public FindItemsInteractor getFindItemsInteractor() {  
    return provideFindItemsInteractorProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;
    private DomainModule domainModule;
    private InteractorsModule interactorsModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      if (domainModule == null) {
        this.domainModule = new DomainModule();
      }
      if (interactorsModule == null) {
        this.interactorsModule = new InteractorsModule();
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  
    public Builder domainModule(DomainModule domainModule) {  
      if (domainModule == null) {
        throw new NullPointerException("domainModule");
      }
      this.domainModule = domainModule;
      return this;
    }
  
    public Builder interactorsModule(InteractorsModule interactorsModule) {  
      if (interactorsModule == null) {
        throw new NullPointerException("interactorsModule");
      }
      this.interactorsModule = interactorsModule;
      return this;
    }
  }
}

