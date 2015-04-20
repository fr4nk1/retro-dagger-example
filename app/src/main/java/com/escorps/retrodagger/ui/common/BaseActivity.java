package com.escorps.retrodagger.ui.common;

import android.app.Activity;
import android.os.Bundle;

import com.escorps.retrodagger.App;
import com.escorps.retrodagger.component.AppComponent;

public abstract class BaseActivity extends Activity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent((AppComponent) App.get(this).component());
    }


    protected abstract void setupComponent(AppComponent appComponent);
}
