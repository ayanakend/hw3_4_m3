package com.example.hw3_4_m3.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_4_m3.R;
import com.example.hw3_4_m3.ToysViewHolder;

import java.util.ArrayList;

public class ToysAdapter extends RecyclerView.Adapter<ToysViewHolder> {

    private ArrayList<String> toyList;
    private ArrayList<Integer> imgList;

    public ToysAdapter(ArrayList<String> toyList, ArrayList<Integer> imgList) {
        this.toyList = toyList;
        this.imgList = imgList;
    }

    @NonNull
    @Override
    public ToysViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ToysViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_toys, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToysViewHolder holder, int position) {
        holder.bind(toyList.get(position), imgList.get(position));
    }

    @Override
    public int getItemCount() {
        return toyList.size();
    }
}
