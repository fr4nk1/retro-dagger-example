// Generated code from Butter Knife. Do not modify!
package com.escorps.retrodagger.ui.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.escorps.retrodagger.ui.main.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230783, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131230783, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131230784, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131230784, "field 'progressBar'");
  }

  @Override public void reset(T target) {
    target.recyclerView = null;
    target.progressBar = null;
  }
}
