package com.escorps.retrodagger.ui.main;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.escorps.retrodagger.R;
import com.escorps.retrodagger.adapter.RecyclerViewAdapter;
import com.escorps.retrodagger.models.PetModel;
import com.escorps.retrodagger.modules.MainModule;
import com.escorps.retrodagger.ui.common.BaseActivity;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter presenter;

    @InjectView(R.id.recycler)
    RecyclerView recyclerView;

    @InjectView(R.id.progress)
    ProgressBar progressBar;

    @Inject
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }

    @Override protected List<Object> getModules() {
        return Arrays.<Object>asList(new MainModule(this));
    }

    @Override protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.INVISIBLE);
    }

    @Override public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override public void setItems(List<PetModel> items) {
        if(adapter != null){
            adapter.setItems(items);
            recyclerView.setAdapter(adapter);
        }
    }

}
