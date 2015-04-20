package com.escorps.retrodagger.modules;

import com.escorps.retrodagger.ui.main.MainView;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainModule_ProvideViewFactory implements Factory<MainView> {
  private final MainModule module;

  public MainModule_ProvideViewFactory(MainModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public MainView get() {  
    MainView provided = module.provideView();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MainView> create(MainModule module) {  
    return new MainModule_ProvideViewFactory(module);
  }
}

