package com.example.myappp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private ArrayList<String> list;
    private MyCallBack myCallBack;


    public MyAdapter(ArrayList<String> list, MyCallBack myCallBack) {
        this.list = list;
        this.myCallBack = myCallBack;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.bind(list.get(i));
        myViewHolder.itemView.setOnClickListener(view -> myCallBack.itemClick());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    interface MyCallBack {

        void itemClick();

    }
}
