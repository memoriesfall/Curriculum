package com.memoriesfall.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by memoriesFall on 2017/4/28.
 */

public class OtherActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String value = intent.getStringExtra("testIntent");
        Log.e("IntentReceiver-->Test", value);
    }
}
