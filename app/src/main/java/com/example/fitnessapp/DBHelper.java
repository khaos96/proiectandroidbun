package com.example.fitnessapp;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHelper  extends SQLiteOpenHelper {


    public DBHelper(Context context){
        super(context,"Login.db",null,2);
    }

    @Override
    public void onCreate(SQLiteDatabase yourpersonaltrainer) {
        yourpersonaltrainer.execSQL("create Table customers(username Text primary key,name Text,email Text,password Text)");
        //yourpersonaltrainer.execSQL("create Table progress(id Text primary key autoincrement,date Text,musclegroup Text,workouttype Text,workoutvolume Text, maxrep Text, weight Text, measurements Text)");
        String sqlprogress = "CREATE TABLE progress(date Text primary key,musclegroup Text,workouttype Text,workoutvolume Text, maxrep Text, weight Text, measurements Text)";
        yourpersonaltrainer.execSQL(sqlprogress);
    }



    @Override
    public void onUpgrade(SQLiteDatabase yourpersonaltrainer, int oldVersion, int newVersion) {

        yourpersonaltrainer.execSQL("drop Table if exists customers");
        //yourpersonaltrainer.execSQL("drop Table if exists progress");
        String sqlprogress  = "DROP TABLE IF EXISTS progress";
        yourpersonaltrainer.execSQL(sqlprogress);
        onCreate(yourpersonaltrainer);
    }

    public Boolean insertData(String username,String name,String email,String password){

            SQLiteDatabase yourpersonaltrainer = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("email",email);
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result = yourpersonaltrainer.insert("customers",null,contentValues);

        if(result == -1){
            return false;
        }
        else{
            return true;
        }
    }

        public Boolean checkUsername(String username){

        SQLiteDatabase yourpersonaltrainer = this.getWritableDatabase();
        Cursor cursor = yourpersonaltrainer.rawQuery("select * from customers where username = ?",new String[]{username});
        if(cursor.getCount()>0){
            return true;
        }
        else{
            return false;
        }
    }

        public Boolean checkUsernamePassword(String username,String password){

            SQLiteDatabase yourpersonaltrainer = this.getWritableDatabase();
            Cursor cursor = yourpersonaltrainer.rawQuery("select * from customers where username = ? and password = ?",new String[]{username,password});
            if (cursor.getCount() > 0) {

                return true;
            }
            else{
                return false;
            }

        }

        public Boolean updatepassword(String username, String password){

            SQLiteDatabase yourpersonaltrainer = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("password",password);
            long result = yourpersonaltrainer.update("customers",contentValues,"username= ?",new String[]{username});
            if(result == 1){
                return false;
            }else{
                return true;
            }
        }

        public boolean addProgress(String date, String musclegroup, String workouttype, String workoutvolume, String maxrep, String weight, String measurements){


            SQLiteDatabase yourpersonaltrainer = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("date",date);
            contentValues.put("musclegroup",musclegroup);
            contentValues.put("workouttype",workouttype);
            contentValues.put("workoutvolume",workoutvolume);
            contentValues.put("maxrep",maxrep);
            contentValues.put("weight",weight);
            contentValues.put("measurements",measurements);
              yourpersonaltrainer.insert("progress",null,contentValues);
                return true;




    }

    public List<ProgressModelClass>getProgressList(){

        SQLiteDatabase yourpersonaltrainer = this.getWritableDatabase();
        List<ProgressModelClass> storeProgress = new ArrayList<>();
        Cursor cursor = yourpersonaltrainer.rawQuery("select * from progress ",null);
        if ((cursor.moveToFirst())){
            do{

                String date = cursor.getString(1);
                String musclegroup = cursor.getString(2);
                String workouttype = cursor.getString(3);
                String workoutvolume = cursor.getString(4);
                String maxrep = cursor.getString(5);
                String weight = cursor.getString(6);
                String measurements = cursor.getString(7);
                storeProgress.add(new ProgressModelClass(date,musclegroup,workouttype,workoutvolume,maxrep,weight,measurements));
            }while(cursor.moveToNext());
        }
        cursor.close();
        return storeProgress;



    }



}
