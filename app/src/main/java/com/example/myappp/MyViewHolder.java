package com.example.myappp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView text;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.textView);
    }

    public void bind(String name) {
        text.setText(name);
    }
}
