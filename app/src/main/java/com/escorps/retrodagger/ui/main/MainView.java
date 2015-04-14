package com.escorps.retrodagger.ui.main;

import com.escorps.retrodagger.models.PetModel;

import java.util.List;

public interface MainView {

    public void showProgress();

    public void hideProgress();

    public void setItems(List<PetModel> items);

}
