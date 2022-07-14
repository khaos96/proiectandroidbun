package com.example.fitnessapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ExercisesListViewAdapter extends ArrayAdapter<String> {

    ArrayList<String> list;
    Context context;

    public ExercisesListViewAdapter(Context context, ArrayList<String>items){
        super(context, R.layout.list_row, items);
        this.context = context;
        list = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_row, null);

            TextView number = convertView.findViewById(R.id.exnumber);
            number.setText(position + 1 + ".");

            TextView name = convertView.findViewById(R.id.exname);
            name.setText(list.get(position));

            ImageView copy = convertView.findViewById(R.id.excopy);
            ImageView remove = convertView.findViewById(R.id.exremove);

            copy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    FavoriteListExercisesActivity.addItem(list.get(position));
                }
            });
            remove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    FavoriteListExercisesActivity.removeItem(position);
                }
            });
        }
        return convertView;
    }
}
