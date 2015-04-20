package com.escorps.retrodagger.interactors;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorsModule_ProvideFindItemsInteractorFactory implements Factory<FindItemsInteractor> {
  private final InteractorsModule module;

  public InteractorsModule_ProvideFindItemsInteractorFactory(InteractorsModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public FindItemsInteractor get() {  
    FindItemsInteractor provided = module.provideFindItemsInteractor();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<FindItemsInteractor> create(InteractorsModule module) {  
    return new InteractorsModule_ProvideFindItemsInteractorFactory(module);
  }
}

