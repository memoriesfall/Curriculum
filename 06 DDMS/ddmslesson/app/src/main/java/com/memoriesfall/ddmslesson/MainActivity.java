package com.memoriesfall.ddmslesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1 = null;
    static final String TAG = "LogActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.button);
        Log.v(TAG,"onCreate is running!");
        b1.setOnClickListener(new ButtonOnClickListener());
    }

    class ButtonOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Main2Activity.class);
            MainActivity.this.startActivity(intent);
        }
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
