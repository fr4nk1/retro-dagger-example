package com.escorps.retrodagger;

import android.app.Application;
import com.escorps.retrodagger.domain.AnalyticsManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class App_MembersInjector implements MembersInjector<App> {
  private final MembersInjector<Application> supertypeInjector;
  private final Provider<AnalyticsManager> analyticsManagerProvider;

  public App_MembersInjector(MembersInjector<Application> supertypeInjector, Provider<AnalyticsManager> analyticsManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert analyticsManagerProvider != null;
    this.analyticsManagerProvider = analyticsManagerProvider;
  }

  @Override
  public void injectMembers(App instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.analyticsManager = analyticsManagerProvider.get();
  }

  public static MembersInjector<App> create(MembersInjector<Application> supertypeInjector, Provider<AnalyticsManager> analyticsManagerProvider) {  
      return new App_MembersInjector(supertypeInjector, analyticsManagerProvider);
  }
}

