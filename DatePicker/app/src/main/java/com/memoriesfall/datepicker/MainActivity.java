package com.memoriesfall.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.text.method.DateKeyListener;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.app.DatePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    private TextView showDate;
    private Button setDate;
    private int y;
    private int m;
    private int d;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDate = (TextView)this.findViewById(R.id.showdate);
        setDate = (Button)this.findViewById(R.id.setdate);
        //获取控件的id
        Calendar C = Calendar.getInstance(Locale.ENGLISH);
        Date date1 = new Date();
        C.setTime(date1);

        y = C.get(Calendar.YEAR);
        m = C.get(Calendar.MONTH);
        d = C.get(Calendar.DAY_OF_MONTH);

        showDate.setText("现在的日期为："+y+"-"+(m+1)+"-"+d);

        setDate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog1 = new DatePickerDialog(MainActivity.this, DateListener,y,m,d);
                datePickerDialog1.show();

            }
        });
    }

    private DatePickerDialog.OnDateSetListener DateListener = new DatePickerDialog.OnDateSetListener(){
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            y = year;
            m = month;
            d = dayOfMonth;

            updateDate();
        }
        private void updateDate(){
            showDate.setText("新的日期为："+y+"-"+(m+1)+"-"+d);
        }
    };

}
