package com.example.myappp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdapter.MyCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter adapter = new MyAdapter(getMyList(), this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);




    }

    public ArrayList<String> getMyList() {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            a.add("Vadim");
        }

        return a;
    }


    @Override
    public void itemClick() {
        Toast.makeText(this,"vadim", Toast.LENGTH_SHORT).show();
    }
}
