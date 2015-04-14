package com.escorps.retrodagger.api;


import com.escorps.retrodagger.models.PetModel;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;

public interface MyApi {

    @Headers({
            "Content-type: application/json"
    })

    @GET("/pet/findByStatus?status=available")
    public void getPets(Callback<List<PetModel>> callback);

}
