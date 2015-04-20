package com.escorps.retrodagger.modules;

import com.escorps.retrodagger.adapter.RecyclerViewAdapter;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainModule_ProvideRecyclerViewAdapterFactory implements Factory<RecyclerViewAdapter> {
  private final MainModule module;

  public MainModule_ProvideRecyclerViewAdapterFactory(MainModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public RecyclerViewAdapter get() {  
    RecyclerViewAdapter provided = module.provideRecyclerViewAdapter();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<RecyclerViewAdapter> create(MainModule module) {  
    return new MainModule_ProvideRecyclerViewAdapterFactory(module);
  }
}

