package com.escorps.retrodagger.ui.main;

import com.escorps.retrodagger.interactors.FindItemsInteractor;
import com.escorps.retrodagger.models.PetModel;

import java.util.List;

public class MainPresenterImpl implements MainPresenter, OnFinishedListener {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, FindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override public void onResume() {
        mainView.showProgress();
        findItemsInteractor.findItems(this);
    }

    @Override public void onFinished(List<PetModel> items) {
        mainView.hideProgress();
        mainView.setItems(items);
    }
}
