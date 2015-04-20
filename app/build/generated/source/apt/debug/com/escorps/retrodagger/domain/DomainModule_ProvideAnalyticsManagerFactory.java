package com.escorps.retrodagger.domain;

import android.app.Application;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DomainModule_ProvideAnalyticsManagerFactory implements Factory<AnalyticsManager> {
  private final DomainModule module;
  private final Provider<Application> appProvider;

  public DomainModule_ProvideAnalyticsManagerFactory(DomainModule module, Provider<Application> appProvider) {  
    assert module != null;
    this.module = module;
    assert appProvider != null;
    this.appProvider = appProvider;
  }

  @Override
  public AnalyticsManager get() {  
    AnalyticsManager provided = module.provideAnalyticsManager(appProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<AnalyticsManager> create(DomainModule module, Provider<Application> appProvider) {  
    return new DomainModule_ProvideAnalyticsManagerFactory(module, appProvider);
  }
}

