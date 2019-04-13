package com.example.myappp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdapter.MyCallBack {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter adapter = new MyAdapter(getMyList(), this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<String> getMyList() {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            a.add("Вадим");
            a.add("Сергей");
            a.add("Булат");
            a.add("Илья");
        }
        return a;
    }

    @Override
    public void itemClick(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder .setTitle("Name")
                .setMessage(s)
                .setCancelable(false)
                .setNegativeButton("OK", (dialog, which) -> Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show())
                .setPositiveButton("Decline", (dialog, which) -> {});
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
