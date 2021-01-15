package com.example.thumbnailview;

import com.example.thumbnailview.RequestPrdList;
import com.example.thumbnailview.ResponsePrdList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface thumbnailService {
    final String BASE_RUL = "https://dev.l-walk.com:28080";

    @Headers("Content-Type: application/json")
    @POST("/v1/ar/prdtList")
    Call<ResponsePrdList> getPrdList(@Body RequestPrdList requestprdlist);
}