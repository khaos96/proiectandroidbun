
package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class ViewProgressActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_progress);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        DBHelper dbHelper = new DBHelper(this);
        List<ProgressModelClass> progressModelClasses = dbHelper.getProgressList();

        if(progressModelClasses.size() > 0){

            ProgressAdapterClass progressAdapterClass = new ProgressAdapterClass(progressModelClasses,ViewProgressActivity.this);
            recyclerView.setAdapter(progressAdapterClass);
        }else{
            Toast.makeText(ViewProgressActivity.this,"There is no progress in database",Toast.LENGTH_SHORT).show();
        }
    }
}

