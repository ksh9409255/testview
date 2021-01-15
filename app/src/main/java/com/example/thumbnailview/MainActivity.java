package com.example.thumbnailview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RtnData list;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(thumbnailService.BASE_RUL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    thumbnailService thumbnailservice = retrofit.create(thumbnailService.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*recyclerView = (RecyclerView) findViewById(R.id.rv_prod);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter();*/
        thumbnailservice.getPrdList(new RequestPrdList("","","","","")).enqueue(new Callback<ResponsePrdList>() {
            @Override
            public void onResponse(Call<ResponsePrdList> call, Response<ResponsePrdList> response) {
                if(response.body().getRtnCd().equals("00")) {
                    Log.e("성공!","성공!");
                    //list = response.body().getRtnData();
                    //getData(list);
                }
            }
            @Override
            public void onFailure(Call<ResponsePrdList> call, Throwable t) {
                Log.e("fail", "fail");
            }
        });
        //recyclerView.setAdapter(adapter);
    }
    /*private void getData(RtnData list) {

        for (int i = 0; i < list.getThumbnaildata().size(); i++) {
            RecyclerListData data = new RecyclerListData();

            data.setProdName(list.getThumbnaildata()[i].getPrdtNm());
            data.setProdImage(list.getThumbnaildata()[i].getThumFileUrl());
            data.setModelName(list.getThumbnaildata()[i].getModlNm());

            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();
    }*/
}