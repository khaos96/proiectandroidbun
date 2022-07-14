package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FavoriteListExercisesActivity extends AppCompatActivity {

    static ListView listview;
    static ArrayList<String> items;
    static ExercisesListViewAdapter adapter;

    EditText input;
    ImageView enter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_list_exercises);

        listview = findViewById(R.id.listviewex);
        input = findViewById(R.id.inputex);
        enter = findViewById(R.id.addexercise);


        items = new ArrayList<>();


        listview.setLongClickable(true);
        adapter = new ExercisesListViewAdapter(getApplicationContext(),items);
        listview.setAdapter(adapter);



        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = input.getText().toString();
                if(text == null || text.length() == 0){
                    Toast.makeText(FavoriteListExercisesActivity.this,"Enter an item",Toast.LENGTH_SHORT).show();
                }else{
                    addItem(text);
                    input.setText("");
                    Toast.makeText(FavoriteListExercisesActivity.this,"Added: "+text,Toast.LENGTH_SHORT).show();
                }
            }
        });

        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(FavoriteListExercisesActivity.this,"Removed: "+items.get(i),Toast.LENGTH_SHORT).show();
                removeItem(i);
                return false;
            }
        });

        loadContent();


    }

    public void loadContent(){
        File path = getApplicationContext().getFilesDir();
        File readFrom = new File(path,"list.txt");
        byte[] content = new byte[(int) readFrom.length()];

        try {
            FileInputStream stream = new FileInputStream(readFrom);
            stream.read(content);

            String s = new String(content);
            s = s.substring(1, s.length() - 1);
            String split[] = s.split(", ");
            items= new ArrayList<>(Arrays.asList(split));
            adapter = new ExercisesListViewAdapter(this,items);
            listview.setAdapter(adapter);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onDestroy() {
        File path = getApplicationContext().getFilesDir();
        try {
            FileOutputStream writer = new FileOutputStream(new File(path,"list.txt"));
            writer.write(items.toString().getBytes());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onDestroy();
    }

    public static void removeItem(int remove){
        items.remove(remove);
        listview.setAdapter(adapter);
    }

    public static void addItem(String item){
        items.add(item);
        listview.setAdapter(adapter);
    }
}