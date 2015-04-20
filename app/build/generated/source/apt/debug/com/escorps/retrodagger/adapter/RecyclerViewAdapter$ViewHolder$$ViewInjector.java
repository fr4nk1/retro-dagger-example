// Generated code from Butter Knife. Do not modify!
package com.escorps.retrodagger.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class RecyclerViewAdapter$ViewHolder$$ViewInjector<T extends com.escorps.retrodagger.adapter.RecyclerViewAdapter.ViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230785, "field 'textName'");
    target.textName = finder.castView(view, 2131230785, "field 'textName'");
  }

  @Override public void reset(T target) {
    target.textName = null;
  }
}
