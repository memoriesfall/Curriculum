package com.memoriesfall.broadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1 = null;
    private final String X = "xxxxxxx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new Buttonlistener());
    }
    class Buttonlistener implements OnClickListener{


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(X);
            intent.putExtra("test","23333");
        }
    }
}
