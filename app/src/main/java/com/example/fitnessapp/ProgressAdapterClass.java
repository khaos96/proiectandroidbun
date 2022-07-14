
package com.example.fitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProgressAdapterClass extends RecyclerView.Adapter<ProgressAdapterClass.ViewHolder> {

    List<ProgressModelClass> employee;
    Context context;
    DBHelper dbHelper;

    public ProgressAdapterClass(List<ProgressModelClass> employee, Context context) {
        this.employee = employee;
        this.context = context;
        dbHelper = new DBHelper(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.progress_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder((view));
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final ProgressModelClass progressModelClass = employee.get(position);
        holder.editText_date.setText(progressModelClass.getDate());
        holder.editText_workouttype.setText(progressModelClass.getWorkouttype());
        holder.editText_weight.setText(progressModelClass.getWeight());
        holder.editText_measruement.setText(progressModelClass.getMeasurements());
        holder.editText_maxrep.setText(progressModelClass.getMaxrep());
        holder.editText_musclegroup.setText(progressModelClass.getMusclegroup());
        holder.editText_workoutvolume.setText(progressModelClass.getWorkoutvolume());


    }

    @Override
    public int getItemCount() {
        return employee.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewID;
        EditText editText_date,editText_musclegroup, editText_workouttype,editText_workoutvolume,editText_maxrep,editText_weight,editText_measruement;




        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            editText_date = itemView.findViewById(R.id.edittext_date);
            editText_musclegroup = itemView.findViewById(R.id.edittext_musclegroup);
            editText_workouttype = itemView.findViewById(R.id.edittext_workouttype);
            editText_workoutvolume = itemView.findViewById(R.id.edittext_workoutvolume);
            editText_maxrep = itemView.findViewById(R.id.edittext_maxrep);
            editText_weight = itemView.findViewById(R.id.edittext_weight);
            editText_measruement = itemView.findViewById(R.id.edittext_measurement);





        }
    }
}
