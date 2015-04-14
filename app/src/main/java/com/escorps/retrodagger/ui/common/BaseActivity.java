package com.escorps.retrodagger.ui.common;

import android.app.Activity;
import android.os.Bundle;
import com.escorps.retrodagger.App;
import java.util.List;
import dagger.ObjectGraph;

public abstract class BaseActivity extends Activity {

    private ObjectGraph activityGraph;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityGraph = ((App) getApplication()).createScopedGraph(getModules().toArray());
        activityGraph.inject(this);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        activityGraph = null;
    }

    protected abstract List<Object> getModules();
}
