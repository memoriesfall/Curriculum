package com.memoriesfall.ddmslesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {
    static final String TAG = "Log2Activity";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.v(TAG,"OnCreate is running!");
    }
    @Override
    protected void onStop() {
        Log.v(TAG,"onStop is running!");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG,"onDestroy is running!");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.v(TAG,"onResume is running!");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(TAG,"onPause is running!");
        super.onPause();
    }

    protected void onStart(){
        Log.v(TAG,"onStart is running!");
        super.onStart();
    }

    protected void onRestart() {
        Log.v(TAG,"onRestart is running!");
        super.onRestart();
    }
}
