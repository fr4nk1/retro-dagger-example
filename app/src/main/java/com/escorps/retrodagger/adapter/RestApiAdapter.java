package com.escorps.retrodagger.adapter;

import com.escorps.retrodagger.utils.Constants;
import retrofit.RestAdapter;

public class RestApiAdapter {
    
    private static RestAdapter sharedInstance = null;

    public static RestAdapter getInstance() {
        if (sharedInstance == null){

            sharedInstance = new RestAdapter.Builder()
                    .setEndpoint(Constants.URL)
                    .build();
        }

        return sharedInstance;
    }
}
