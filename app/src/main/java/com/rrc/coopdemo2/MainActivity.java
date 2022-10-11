package com.rrc.coopdemo2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int DATA_COUNT = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] dataset = initDataset();

        RecyclerView rcl1 = findViewById(R.id.rclView);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcl1.setLayoutManager(linearLayoutManager);
        CommentsAdapter adapter1 = new CommentsAdapter(dataset);
        rcl1.setAdapter(adapter1);

    }

    private String[] initDataset() {
        String[] dataset = new String[DATA_COUNT];
        for (int i=0; i!= DATA_COUNT; ++i) {
            dataset[i] = "This is element #" + i;
        }

        return dataset;
    }
}