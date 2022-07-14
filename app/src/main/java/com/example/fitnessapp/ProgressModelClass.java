package com.example.fitnessapp;

public class ProgressModelClass {

    String date,musclegroup,workouttype,workoutvolume,maxrep,weight,measurements;


    public ProgressModelClass(String date, String musclegroup, String workouttype, String workoutvolume, String maxrep, String weight, String measurements) {
        this.date = date;
        this.musclegroup = musclegroup;
        this.workouttype = workouttype;
        this.workoutvolume = workoutvolume;
        this.maxrep = maxrep;
        this.weight = weight;
        this.measurements = measurements;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMusclegroup() {
        return musclegroup;
    }

    public void setMusclegroup(String musclegroup) {
        this.musclegroup = musclegroup;
    }

    public String getWorkouttype() {
        return workouttype;
    }

    public void setWorkouttype(String workouttype) {
        this.workouttype = workouttype;
    }

    public String getWorkoutvolume() {
        return workoutvolume;
    }

    public void setWorkoutvolume(String workoutvolume) {
        this.workoutvolume = workoutvolume;
    }

    public String getMaxrep() {
        return maxrep;
    }

    public void setMaxrep(String maxrep) {
        this.maxrep = maxrep;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }




}
