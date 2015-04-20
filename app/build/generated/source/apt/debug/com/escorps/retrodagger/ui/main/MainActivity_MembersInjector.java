package com.escorps.retrodagger.ui.main;

import com.escorps.retrodagger.adapter.RecyclerViewAdapter;
import com.escorps.retrodagger.ui.common.BaseActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<MainPresenter> presenterProvider;
  private final Provider<RecyclerViewAdapter> adapterProvider;

  public MainActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<MainPresenter> presenterProvider, Provider<RecyclerViewAdapter> adapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert adapterProvider != null;
    this.adapterProvider = adapterProvider;
  }

  @Override
  public void injectMembers(MainActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
    instance.adapter = adapterProvider.get();
  }

  public static MembersInjector<MainActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<MainPresenter> presenterProvider, Provider<RecyclerViewAdapter> adapterProvider) {  
      return new MainActivity_MembersInjector(supertypeInjector, presenterProvider, adapterProvider);
  }
}

