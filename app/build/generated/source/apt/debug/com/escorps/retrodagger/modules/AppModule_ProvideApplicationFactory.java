package com.escorps.retrodagger.modules;

import android.app.Application;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideApplicationFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Application get() {  
    Application provided = module.provideApplication();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Application> create(AppModule module) {  
    return new AppModule_ProvideApplicationFactory(module);
  }
}

