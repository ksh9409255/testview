package com.example.thumbnailview;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder> {
    public ArrayList<RecyclerListData> listData = new ArrayList<>();


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ItemViewHolder(view);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ItemViewHolder holder, int position) {
        holder.onBind(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    void addItem(RecyclerListData recyclerListData) {
        listData.add(recyclerListData);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView prodName;
        private TextView modelName;
        private ImageView prodImage;

        ItemViewHolder(View itemView) {
            super(itemView);
            prodName = itemView.findViewById(R.id.prod_name);
            modelName = itemView.findViewById(R.id.prod_model);
            prodImage = itemView.findViewById(R.id.prod_image);
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public void onBind(RecyclerListData listData) {
            prodName.setText(listData.getProdName());
            modelName.setText(listData.getModelName());
            Glide.with(itemView).load(listData.getProdImage()).into(prodImage);
        }
    }
}
