package com.example.hw3_4_m3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_4_m3.adapter.ToysAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> toyList = new ArrayList<>();
    private ArrayList<Integer> imgList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        addData();
        ToysAdapter adapter = new ToysAdapter(toyList, imgList);
        recyclerView.setAdapter(adapter);
    }

    void findView() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    void addData() {
        toyList.add("Taddy");
        toyList.add("Doll");
        toyList.add("Car");
        toyList.add("Constructor");
        toyList.add("Dinosaur");
        toyList.add("Taddy");
        toyList.add("Taddy");
        toyList.add("Taddy");
        toyList.add("Taddy");
        toyList.add("Taddy");
        imgList.add(R.drawable.logo);
        imgList.add(R.drawable.logo);
        imgList.add(R.drawable.logo);
        imgList.add(R.drawable.logo);
        imgList.add(R.drawable.logo);
    }

}
