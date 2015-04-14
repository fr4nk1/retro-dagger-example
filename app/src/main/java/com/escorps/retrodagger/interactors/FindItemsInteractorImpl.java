package com.escorps.retrodagger.interactors;

import com.escorps.retrodagger.adapter.RestApiAdapter;
import com.escorps.retrodagger.api.MyApi;
import com.escorps.retrodagger.models.PetModel;
import com.escorps.retrodagger.ui.main.OnFinishedListener;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FindItemsInteractorImpl implements FindItemsInteractor {

    @Override public void findItems(final OnFinishedListener listener) {

        MyApi myAddress = RestApiAdapter.getInstance().create(MyApi.class);
        myAddress.getPets(new Callback<List<PetModel>>() {

            @Override
            public void success(List<PetModel> petModelList, Response response) {
                listener.onFinished(petModelList);
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                retrofitError.printStackTrace();
            }
        });

    }
}
