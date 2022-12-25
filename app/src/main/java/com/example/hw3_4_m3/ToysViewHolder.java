package com.example.hw3_4_m3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ToysViewHolder extends RecyclerView.ViewHolder {

    ImageView imageViewToy;
    TextView textViewToy;

    public ToysViewHolder(@NonNull View itemView) {
        super(itemView);
        findView();
    }

    public void bind(String name, Integer image) {
        imageViewToy.setImageResource(image);
    }

    void findView() {
        textViewToy = itemView.findViewById(R.id.textView_name);
        imageViewToy = itemView.findViewById(R.id.imageView);
    }
}
