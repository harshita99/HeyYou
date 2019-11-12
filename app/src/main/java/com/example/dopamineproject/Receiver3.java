package com.example.dopamineproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Receiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Log.i("App", "called receiver method");
        try{
            notification1.Notification(context);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
