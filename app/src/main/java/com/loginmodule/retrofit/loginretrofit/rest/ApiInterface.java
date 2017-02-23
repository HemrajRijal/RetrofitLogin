package com.loginmodule.retrofit.loginretrofit.rest;

import com.loginmodule.retrofit.loginretrofit.model.ServerRequest;
import com.loginmodule.retrofit.loginretrofit.model.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Hemraj on 2/23/2017.
 */

public interface ApiInterface {

    @POST("api/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}