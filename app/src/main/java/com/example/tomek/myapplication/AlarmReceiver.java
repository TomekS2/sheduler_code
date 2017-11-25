package com.example.tomek.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by Tomek on 20.11.2017.
 */

class AlarmReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, new Date().toString(),
                Toast.LENGTH_SHORT).show();
        System.out.println(new Date().toString());
    }
}
