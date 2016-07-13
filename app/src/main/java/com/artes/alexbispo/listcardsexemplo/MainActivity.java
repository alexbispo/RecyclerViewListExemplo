package com.artes.alexbispo.listcardsexemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.artes.alexbispo.listcardsexemplo.adapters.ExemploAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private ExemploAdapter mExemploAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.example_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mExemploAdapter = new ExemploAdapter(exemploDataSet());
        mRecyclerView.setAdapter(mExemploAdapter);
    }

    private String[] exemploDataSet() {
        String[] dataSet = {"Brasil", "Argentina", "Colômbia",
                "México", "Canadá", "Irlanda", "Inglaterra", "Estados Unidos"};
        return dataSet;
    }

}
